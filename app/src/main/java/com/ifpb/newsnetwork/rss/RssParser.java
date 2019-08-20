package com.ifpb.newsnetwork.rss;

import android.util.Log;

import com.prof.rssparser.Article;
import com.prof.rssparser.Parser;

import java.util.ArrayList;

public class RssParser {

    private Parser parser;
    private String url;

    public RssParser(String url){
        this.url = url;
        parser = new Parser();
        init();
    }

    private void init() {
        parser.execute(url);
        parser.onFinish(new Parser.OnTaskCompleted() {
            @Override
            public void onTaskCompleted(ArrayList<Article> arrayList) {
                Log.e("teste array","============" + arrayList.get(1) + "============");
            }

            @Override
            public void onError() {
                Log.e("erro", "erro");
            }
        });
    }


}
