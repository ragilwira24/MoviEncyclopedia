package com.smartfrenl.moviencyclopedia.adapter.tv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.constant.CommonConstant;
import com.smartfrenl.moviencyclopedia.glide.GlideApp;
import com.smartfrenl.moviencyclopedia.model.tv.Result;
import com.smartfrenl.moviencyclopedia.viewholder.NowPlayingViewHolder;

import java.util.List;

public class AiringTodayAdapter extends RecyclerView.Adapter<NowPlayingViewHolder>{

    private Context context;
    private List<Result> results;

    public AiringTodayAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @Override
    public NowPlayingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.nowplaying_fragment, viewGroup, false);
        return new NowPlayingViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NowPlayingViewHolder nowPlayingViewHolder, final int i) {
        final Result result = results.get(i);
        nowPlayingViewHolder.title.setText(result.getName());
        nowPlayingViewHolder.overview.setText(result.getOverview());
        nowPlayingViewHolder.releaseDate.setText(result.getFirst_air_date());
        String imageUrl = CommonConstant.getBaseUrlImage() + result.getBackdrop_path();
        GlideApp.with(context).load(imageUrl).into(nowPlayingViewHolder.poster);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
