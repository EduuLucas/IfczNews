package com.ifpb.newsnetwork.telas;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.ifpb.newsnetwork.componentes.UpBar;

public class TelaNoticia extends Activity {

    private LinearLayout root;
    private LinearLayout layoutupbar;
    private LinearLayout layoutnoticia;
    private LinearLayout layoutimagem;
    private LinearLayout layouttexto;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        root.setBackgroundColor(Color.rgb(237, 240, 241));
        root.setOrientation(LinearLayout.VERTICAL);

        setContentView(root);

        setLayoutUpBar();
        setLayoutNoticia();

        root.addView(layoutupbar);
        root.addView(layoutnoticia);

    }

    private void setLayoutUpBar() {

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,300);
        layoutupbar = new LinearLayout(this);
        layoutupbar.setOrientation(LinearLayout.VERTICAL);
        layoutupbar.setLayoutParams(p);
        UpBar upBar = new UpBar(this, "NewsNetwork");
        layoutupbar.addView(upBar);

    }

    private void setLayoutNoticia() {

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutnoticia = new LinearLayout(this);
        layoutnoticia.setOrientation(LinearLayout.VERTICAL);
        layoutnoticia.setLayoutParams(p);



    }
}
