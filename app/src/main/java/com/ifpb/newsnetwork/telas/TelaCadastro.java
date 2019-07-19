package com.ifpb.newsnetwork.telas;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.ifpb.newsnetwork.R;
import com.ifpb.newsnetwork.componentes.TextFieldBox;
import com.ifpb.newsnetwork.componentes.UpBar;

public class TelaCadastro extends Activity {

    private LinearLayout root;
    private LinearLayout layouttoolbar;
    private LinearLayout layoutform;
    private LinearLayout layoutcamposcadastro;

    @TargetApi(Build.VERSION_CODES.N)


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        root = new LinearLayout(this);

        root.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        root.setBackgroundColor(Color.rgb(237, 240, 241));

        root.setOrientation(LinearLayout.VERTICAL);

        setContentView(root);

        setLayoutToolBar();
        setLayoutForm();

        //setando layouts na tela
        root.addView(layouttoolbar);
        root.addView(layoutform);

    }
        //Adicionando a toolbar
        private void setLayoutToolBar() {
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,300);
            layouttoolbar = new LinearLayout(this);
            layouttoolbar.setOrientation(LinearLayout.VERTICAL);
            layouttoolbar.setLayoutParams(p);
            UpBar upBar = new UpBar(this, "NewsNetwork");
            layouttoolbar.addView(upBar);
        }

    private void setLayoutForm() {
        layoutform = new LinearLayout(this);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutform.setLayoutParams(p);
        layoutform.setOrientation(LinearLayout.VERTICAL);

        setLayoutCamposCadastro();

        layoutform.setPadding(20, 600, 20, 200);


        layoutform.addView(layoutcamposcadastro);

        Button b1 = new Button(this);
        b1.setId(View.generateViewId());
        b1.setText("Cadastrar");
        layoutform.addView(b1);
    }

    private void setLayoutCamposCadastro(){

        layoutcamposcadastro = new LinearLayout(this);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutcamposcadastro.setLayoutParams(p);
        layoutcamposcadastro.setOrientation(LinearLayout.VERTICAL);

        TextFieldBox nome = new TextFieldBox(this, "Nome");
        TextFieldBox email = new TextFieldBox(this, "Email");
        TextFieldBox senha = new TextFieldBox(this, "Senha");
        TextFieldBox confirmar_senha = new TextFieldBox(this, "Confirmar Senha");

        layoutcamposcadastro.addView(nome);
        layoutcamposcadastro.addView(email);
        layoutcamposcadastro.addView(senha);
        layoutcamposcadastro.addView(confirmar_senha);

    }
    //Button "login"


}
