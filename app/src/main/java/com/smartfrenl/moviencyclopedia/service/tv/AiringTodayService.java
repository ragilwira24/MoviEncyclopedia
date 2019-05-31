package com.smartfrenl.moviencyclopedia.service.tv;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.adapter.tv.AiringTodayAdapter;
import com.smartfrenl.moviencyclopedia.application.MoviEncyclopediaApp;
import com.smartfrenl.moviencyclopedia.constant.CommonConstant;
import com.smartfrenl.moviencyclopedia.constant.TvUrlConstant;
import com.smartfrenl.moviencyclopedia.model.tv.Result;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import static com.android.volley.VolleyLog.TAG;

public class AiringTodayService {

    public static void airingTodayItems(View view, RecyclerView recyclerView, AiringTodayAdapter adapter, List<Result> results, FragmentActivity fragmentActivity){
        recyclerView = view.findViewById(R.id.nowPlayingRV);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(fragmentActivity, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
        fetchAiringTodayItems(results, adapter, view);
    }

    private static void fetchAiringTodayItems(final List<Result> results, final AiringTodayAdapter adapter, View view){

        final RelativeLayout relativeLayout = view.findViewById(R.id.nowPlayingSectionPB);

        String url = TvUrlConstant.getNowPlayingUrl() + "?api_key="+ CommonConstant.getApiKey() + "&language=en-US";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    Gson gson = new Gson();
                    JSONArray jsonArray = response.getJSONArray("results");
                    for (int i = 0; i < jsonArray.length() ; i++) {
                        JSONObject jo = jsonArray.getJSONObject(i);
                        Result result = gson.fromJson(jo.toString(), new TypeToken<Result>(){}.getType());
                        results.add(result);
                    }

                    adapter.notifyDataSetChanged();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Error: " + error.getMessage());
            }
        });

        MoviEncyclopediaApp.getInstance().addToRequestQueue(jsonObjectRequest);
        MoviEncyclopediaApp.getInstance().getRequestQueue().addRequestFinishedListener(new RequestQueue.RequestFinishedListener<Object>() {
            @Override
            public void onRequestFinished(Request<Object> request) {
                relativeLayout.setVisibility(View.GONE);
            }
        });
    }

}
