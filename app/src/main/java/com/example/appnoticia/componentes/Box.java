package com.example.appnoticia.componentes;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Box extends LinearLayout {

    private final String name;
    private TextView tv;
    private EditText et;


    private void init(){
        LayoutParams p = new LayoutParams(
                LayoutParams.MATCH_PARENT, 700
        );
        setLayoutParams(p);
        setBackgroundColor(Color.RED);
        setOrientation(LinearLayout.VERTICAL);
        //label
        tv = new TextView(getContext());
        tv.setText(name);
        tv.setGravity(Gravity.CENTER);
        addView(tv);
        //input
        et = new EditText(getContext());
        et.setGravity(Gravity.CENTER);
        addView(et);

    }

    public Box(Context ctx, String name){
        super(ctx);
        this.name = name;
        init();
    }

    public String getValue(){
        return et.getText().toString();
    }


    public static class ToolBar extends LinearLayout {

        private final String name;
        private TextView tv;

        public void init(){

            LayoutParams p = new LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT
            );
            setLayoutParams(p);
            setBackgroundColor(Color.rgb(67, 136, 204));
            setOrientation(LinearLayout.VERTICAL);

            tv = new TextView(getContext());
            tv.setText(name);
            tv.setGravity(Gravity.CENTER);
            tv.setPadding(0, 110, 0, 0);
            tv.setTypeface(Typeface.create("sans-serif-medium", Typeface.NORMAL));
            tv.setTextColor(Color.WHITE);
            tv.setTextSize(20);
            addView(tv);


        }

        public ToolBar(Context context, String name) {
            super(context);
            this.name = name;
            init();
        }


    }
}
