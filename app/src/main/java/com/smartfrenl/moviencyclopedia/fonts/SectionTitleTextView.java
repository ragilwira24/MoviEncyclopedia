package com.smartfrenl.moviencyclopedia.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class SectionTitleTextView extends android.support.v7.widget.AppCompatTextView{

    public SectionTitleTextView(Context context) {
        super(context);
        setFont();
    }
    public SectionTitleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public SectionTitleTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "montserrat_bold.ttf");
        setTypeface(font, Typeface.NORMAL);
    }
}
