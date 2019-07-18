package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UpBar extends LinearLayout {

    private final String nome;
    private TextView textView;

    public UpBar(Context ctx, String nome){
        super(ctx);
        this.nome = nome;
        init();
    }

    private void init() {

        //Criando Layout
        LayoutParams p = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        setOrientation(VERTICAL);
        setBackgroundColor(Color.rgb(67,136,204));

        //Criando texto do layout
        textView = new TextView(getContext());
        textView.setText(nome);
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setPadding(0,90,0,0);
        textView.setTextSize(20);
//        Typeface type = Typeface.createFromAsset(getContext().getAssets(), "font/klavika-bold.otf");
//        textView.setTypeface(type);
        textView.setHeight(290);

        //adicionando a visão
        addView(textView);
    }


}
