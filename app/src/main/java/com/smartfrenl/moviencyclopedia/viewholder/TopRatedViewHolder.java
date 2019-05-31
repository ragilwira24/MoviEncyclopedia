package com.smartfrenl.moviencyclopedia.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.smartfrenl.moviencyclopedia.R;

public class TopRatedViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView releaseDate;
    public TextView score;

    public TopRatedViewHolder(@NonNull View view) {
        super(view);
        title = view.findViewById(R.id.topRatedMovieName);
        releaseDate = view.findViewById(R.id.topRatedReleaseDate);
        score = view.findViewById(R.id.topRatedCount);
    }
}
