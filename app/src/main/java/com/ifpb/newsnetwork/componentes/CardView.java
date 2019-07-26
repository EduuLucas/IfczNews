package com.ifpb.newsnetwork.componentes;

import android.content.Context;
import android.widget.LinearLayout;

public class CardView extends LinearLayout {

    private CardView cardView;

    public CardView(Context ctx){
        super(ctx);
        init();
    }

    private void init() {

        cardView = new CardView(getContext());

    }


}
