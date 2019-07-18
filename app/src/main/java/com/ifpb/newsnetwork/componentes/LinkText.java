package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinkText extends LinearLayout {

    private final String text;
    private TextView textView;

    public LinkText(Context ctx, String text){
        super(ctx);
        this.text = text;
        init();
    }

    private void init() {

        LayoutParams p = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        setLayoutParams(p);
        setGravity(Gravity.CENTER);
        setOrientation(VERTICAL);

        textView = new TextView(getContext());
        textView.setText(text);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(0,25,0,0);
        textView.setTextSize(20);
        textView.setClickable(true);

        addView(textView);
    }

}
