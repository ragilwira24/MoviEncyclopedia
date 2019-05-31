package com.smartfrenl.moviencyclopedia.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class ToolbarTitleTextView extends android.support.v7.widget.AppCompatTextView{

    public ToolbarTitleTextView(Context context) {
        super(context);
        setFont();
    }
    public ToolbarTitleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public ToolbarTitleTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fredokaone_regular.ttf");
        setTypeface(font, Typeface.NORMAL);
    }

}
