package com.smartfrenl.moviencyclopedia.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartfrenl.moviencyclopedia.R;

public class NowPlayingViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView releaseDate;
    public TextView overview;
    public ImageView poster;

    public NowPlayingViewHolder(@NonNull View view) {
        super(view);
        title = view.findViewById(R.id.nowPlayingMovieName);
        releaseDate = view.findViewById(R.id.nowPlayingReleaseDate);
        overview = view.findViewById(R.id.nowPlayingOverview);
        poster = view.findViewById(R.id.nowPlayingImageView);
    }
}
