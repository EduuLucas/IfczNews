package com.ifpb.newsnetwork.telas;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.ifpb.newsnetwork.R;

public class TelaCadastro extends Activity {

    private Button b1;
    private TextView tv;
    private EditText et1, et2, et3, et4;
    private LinearLayout ll;

    @TargetApi(Build.VERSION_CODES.N)


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ll = new LinearLayout(this);
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);


        //Adicionando a toolbar

        Toolbar toolbar = new Toolbar(this);
        LinearLayout.LayoutParams toolBarParams = new LinearLayout.LayoutParams(
                Toolbar.LayoutParams.MATCH_PARENT, Toolbar.LayoutParams.WRAP_CONTENT);
        toolbar.setLayoutParams(toolBarParams);
        toolbar.setBackgroundColor(Color.rgb(96,96,96));
        toolbar.setPopupTheme(R.style.Widget_AppCompat_ActionBar);
        toolbar.setVisibility(View.VISIBLE);
        toolbar.setTitle("Criar conta");

        //toolbar.setNavigationIcon();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                onBackPressed();
            }
        });
        toolbar.setTitleTextColor(Color.WHITE);
        ll.addView(toolbar, 0);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        //editText "Name"

        et1 = new EditText(this);
        et1.setId(View.generateViewId());
        et1.setInputType(InputType.TYPE_CLASS_TEXT);
        et1.setHint("Nome");
        ll.addView(et1, layoutParams);

        //editText "E-mail"

        et2 = new EditText(this);
        et2.setId(View.generateViewId());
        et2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        et2.setHint("Email");
        ll.addView(et2, layoutParams);

        //editText "Password"

        et3 = new EditText(this);
        et3.setId(View.generateViewId());
        et3.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        et3.setHint("Senha");
        ll.addView(et3, layoutParams);

        //editText "Password Confirm"

        et4 = new EditText(this);
        et4.setId(View.generateViewId());
        et4.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        et4.setHint("Confirmar senha");
        ll.addView(et4, layoutParams);

        //Button "login"
        
        b1 = new Button(this);
        b1.setId(View.generateViewId());
        b1.setText("Cadastrar");
        ll.addView(b1, layoutParams);

    }
}
