package com.ifpb.newsnetwork.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Noticia {

    private String titulo;
    private String autor;
    private String link;
    private Date pubDate;
    private String descricao;
    private String conteudo;
    private String imagem;
    private List<String> categorias;

    public Noticia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", link='" + link + '\'' +
                ", pubDate=" + pubDate +
                ", descricao='" + descricao + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", imagem='" + imagem + '\'' +
                ", categorias=" + categorias +
                '}';
    }
}
