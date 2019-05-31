package com.smartfrenl.moviencyclopedia.adapter.movie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.constant.CommonConstant;
import com.smartfrenl.moviencyclopedia.glide.GlideApp;
import com.smartfrenl.moviencyclopedia.model.movie.Result;
import com.smartfrenl.moviencyclopedia.viewholder.PopularViewHolder;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularViewHolder> {

    private Context context;
    private List<Result> results;

    public PopularAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.popular_movie_item, parent, false);
        return new PopularViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {
        final Result result = results.get(position);
        holder.title.setText(result.getTitle());
        holder.releaseDate.setText(result.getRelease_date());
        String imageUrl = CommonConstant.getBaseUrlImage() + result.getPoster_path();
        GlideApp.with(context).load(imageUrl).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
