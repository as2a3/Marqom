package com.advtech.marqoom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by ahmed on 14/03/17.
 */

public class NormalTextView extends AppCompatTextView {

    public NormalTextView(Context context) {
        super(context);
        init();
    }

    public NormalTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NormalTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/NeoSansArabic.ttf");
        setTypeface(typeface);
    }
}