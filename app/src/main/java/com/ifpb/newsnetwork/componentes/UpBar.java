package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UpBar extends LinearLayout {

    private final String nome;
    private TextView textView;
    private EditText editText;

    public UpBar(Context ctx, String nome){
        super(ctx);
        this.nome = nome;
        init();
    }

    public void init(){

    }

}
