package com.smartfrenl.moviencyclopedia.menu.tv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.adapter.tv.AiringTodayAdapter;
import com.smartfrenl.moviencyclopedia.adapter.tv.OngoingTvAdapter;
import com.smartfrenl.moviencyclopedia.adapter.tv.PopularAdapter;
import com.smartfrenl.moviencyclopedia.adapter.tv.TopRatedAdapter;
import com.smartfrenl.moviencyclopedia.model.tv.Result;
import com.smartfrenl.moviencyclopedia.service.tv.AiringTodayService;
import com.smartfrenl.moviencyclopedia.service.tv.OngoingTvService;
import com.smartfrenl.moviencyclopedia.service.tv.PopularService;
import com.smartfrenl.moviencyclopedia.service.tv.TopRatedService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvFragment extends Fragment {

    public TvFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private TopRatedAdapter topRatedAdapter;
    private PopularAdapter popularAdapter;
    private AiringTodayAdapter airingTodayAdapter;
    private OngoingTvAdapter ongoingTvAdapter;

    private List<Result> results;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tv_fragment, container, false);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMM yyyy");

        TextView textView = view.findViewById(R.id.airingDateToday);
        textView.setText("Airing Today : " + sdf.format(date));

        results = new ArrayList<>();
        airingTodayAdapter = new AiringTodayAdapter(getActivity(), results);
        AiringTodayService.airingTodayItems(view, recyclerView, airingTodayAdapter, results, getActivity());

        results.clear();
        results = new ArrayList<>();
        ongoingTvAdapter = new OngoingTvAdapter(getActivity(), results);
        OngoingTvService.ongoingTvItems(view,recyclerView, ongoingTvAdapter, results, getActivity());

        results.clear();
        results = new ArrayList<>();
        topRatedAdapter = new TopRatedAdapter(getActivity(), results);
        TopRatedService.topRatedItems(view,recyclerView, topRatedAdapter, results, getActivity());

        results.clear();
        results = new ArrayList<>();
        popularAdapter = new PopularAdapter(getActivity(), results);
        PopularService.popularItems(view,recyclerView, popularAdapter, results, getActivity());

        return view;
    }

}
