package com.smartfrenl.moviencyclopedia.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartfrenl.moviencyclopedia.R;

public class ComingSoonViewHolder  extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView releaseDate;
    public ImageView poster;

    public ComingSoonViewHolder(@NonNull View view) {
        super(view);
        title = view.findViewById(R.id.comingSoonCardMovieName);
        releaseDate = view.findViewById(R.id.comingSoonCardReleaseDate);
        poster = view.findViewById(R.id.comingSoonCardImage);
    }
}
