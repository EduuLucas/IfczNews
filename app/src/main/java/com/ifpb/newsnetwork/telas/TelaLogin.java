package com.ifpb.newsnetwork.telas;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ifpb.newsnetwork.componentes.LinkText;
import com.ifpb.newsnetwork.componentes.TextFieldBox;
import com.ifpb.newsnetwork.componentes.UpBar;
import com.ifpb.newsnetwork.rss.RssParser;

public class TelaLogin extends Activity {

    private LinearLayout root;
    private LinearLayout layouttoolbar;
    private LinearLayout layoutcampologin;
    private LinearLayout layoutcadastro;
    private RssParser parser = new RssParser("https://www.diariodosertao.com.br/feed");

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
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,300);
        layouttoolbar = new LinearLayout(this);
        layouttoolbar.setOrientation(LinearLayout.VERTICAL);
        layouttoolbar.setLayoutParams(p);
        UpBar upBar = new UpBar(this, "NewsNetwork");
        layouttoolbar.addView(upBar);
    }

    private void setLayoutcampologin() {
        layoutcampologin = new LinearLayout(this);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutcampologin.setLayoutParams(p);
        layoutcampologin.setOrientation(LinearLayout.VERTICAL);
        TextFieldBox email = new TextFieldBox(this, "Email");
        TextFieldBox senha = new TextFieldBox(this, "Senha");
        layoutcampologin.setPadding(20, 900, 20, 100);
        layoutcampologin.addView(email);
        layoutcampologin.addView(senha);
    }

    private void setLayoutcadastro() {
        layoutcadastro = new LinearLayout(this);
        LinkText textocadastro =  new LinkText(this, "Ainda não tem uma conta?");
        layoutcadastro.addView(textocadastro);
    }
}