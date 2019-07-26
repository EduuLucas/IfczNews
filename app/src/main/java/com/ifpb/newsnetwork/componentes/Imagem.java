package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ifpb.newsnetwork.R;

public class Imagem extends LinearLayout {

    private LinearLayout root;
    private ImageView imageView;
    private String imagem;

    public Imagem(Context ctx, String imagem){
        super(ctx);
        this.imagem = imagem;
        init();
    }


    public void init(){

        root = new LinearLayout(this);

        root.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        root.setOrientation(LinearLayout.VERTICAL);

        imageView = new ImageView();

        //setting image resource
        imageView.setImageResource(getContext().getAssets().);

        //setting image position
        imageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //adding view to layout
        linearLayout.addView(imageView);
        //make visible to program
        // setContentView(linearLayout);

    }

}
