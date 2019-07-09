package com.example.appnoticia.componentes;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ToolBar extends LinearLayout {

    private LinearLayout root;
    private final String name;
    private TextView tv;

    public ToolBar(Context context, String name) {
        super(context);
        this.name = name;
        init();
    }

    public void init(){
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        setOrientation(VERTICAL);
        setLayoutParams(layoutParams);
    }

--00============

}
