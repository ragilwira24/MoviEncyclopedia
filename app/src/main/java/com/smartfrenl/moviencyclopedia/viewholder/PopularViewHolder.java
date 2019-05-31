package com.smartfrenl.moviencyclopedia.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartfrenl.moviencyclopedia.R;

public class PopularViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView releaseDate;
    public ImageView poster;

    public PopularViewHolder(@NonNull View view) {
        super(view);
        title = view.findViewById(R.id.popularCardMovieName);
        releaseDate = view.findViewById(R.id.popularCardReleaseDate);
        poster = view.findViewById(R.id.popularCardImage);
    }
}
