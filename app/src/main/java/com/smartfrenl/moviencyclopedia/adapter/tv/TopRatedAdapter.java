package com.smartfrenl.moviencyclopedia.adapter.tv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartfrenl.moviencyclopedia.R;
import com.smartfrenl.moviencyclopedia.model.tv.Result;
import com.smartfrenl.moviencyclopedia.viewholder.TopRatedViewHolder;

import java.util.List;

public class TopRatedAdapter extends RecyclerView.Adapter<TopRatedViewHolder> {

    private Context context;
    private List<Result> results;

    public TopRatedAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }


    @NonNull
    @Override
    public TopRatedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.toprated_item, parent, false);
        return new TopRatedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TopRatedViewHolder holder, int position) {
        final Result result = results.get(position);
        holder.title.setText(result.getName());
        holder.releaseDate.setText(result.getFirst_air_date());
        holder.score.setText(Integer.toString(position + 1));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
