package com.ifpb.newsnetwork.rss;

import android.util.Log;

import com.ifpb.newsnetwork.model.Noticia;
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
                for (Article artigo : arrayList) {

                    Noticia artigonew = new Noticia();

                    artigonew.setAutor(artigo.getAuthor());
                    artigonew.setCategorias(artigo.getCategories());
                    artigonew.setConteudo(artigo.getContent());
                    artigonew.setDescricao(artigo.getDescription());
                    artigonew.setImagem(artigo.getImage());
                    artigonew.setLink(artigo.getLink());
                    artigonew.setPubDate(artigo.getPubDate());
                    artigonew.setTitulo(artigo.getTitle());

                }
            }

            @Override
            public void onError() {
                Log.e("erro", "erro");
            }
        });
    }


}
