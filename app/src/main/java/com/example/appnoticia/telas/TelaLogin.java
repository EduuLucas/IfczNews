package com.example.appnoticia.telas;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appnoticia.componentes.Box;

public class TelaLogin extends AppCompatActivity{

    private LinearLayout root;
    private LinearLayout layouttoolbar;
    private LinearLayout layoutcampologin;
    private LinearLayout layoutcadastro;
    private TextView linkcadastro;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        //Criando layout principal
        super.onCreate(savedInstanceState);

        root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        root.setBackgroundColor(Color.rgb(237, 240, 241));
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        setContentView(root);

        //Configurando os outros layouts

        setLayoutToolBar();
        setLayoutcampologin();
        setLayoutcadastro();

        //setando layouts na tela
        root.addView(layouttoolbar);
        root.addView(layoutcampologin);
        root.addView(layoutcadastro);
    }


    //Criando layout da toolbar
    private void setLayoutToolBar() {
        layouttoolbar = new LinearLayout(this);
        layouttoolbar.setOrientation(LinearLayout.VERTICAL);
        layouttoolbar.setGravity(Gravity.CENTER);
    }

    private void setLayoutcampologin() {

    }

    private void setLayoutcadastro() {

    }


}
