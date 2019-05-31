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
import com.smartfrenl.moviencyclopedia.viewholder.ComingSoonViewHolder;

import java.util.List;

public class ComingSoonAdapter extends RecyclerView.Adapter<ComingSoonViewHolder> {

    private Context context;
    private List<Result> results;

    public ComingSoonAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public ComingSoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comingsoon_movie_item, parent, false);
        return new ComingSoonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ComingSoonViewHolder holder, int position) {
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
