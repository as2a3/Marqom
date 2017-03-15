package com.advtech.marqoom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by ahmed on 14/03/17.
 */

public class BoldButton extends AppCompatButton{
    public BoldButton(Context context) {
        super(context);
        init();
    }

    public BoldButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoldButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/Neo Sans Arabic bold.ttf");
        setTypeface(typeface);
    }
}
