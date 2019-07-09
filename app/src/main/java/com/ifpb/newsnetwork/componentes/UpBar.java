package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
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

        //Setando layout
        LayoutParams p = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        setLayoutParams(p);
        setBackgroundColor(Color.rgb(237,240,241));
        setOrientation(LinearLayout.VERTICAL);

        //Criando textview
        textView = new TextView(getContext());
        textView.setText(nome);
        textView.setGravity(Gravity.LEFT);

        //Criando editText
        editText = new EditText(getContext());
        editText.setGravity(Gravity.LEFT);

        //Adicionando a visão
        addView(textView);
        addView(editText);
    }

}
