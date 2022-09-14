package com.example.avaliacao_01.models;

import android.graphics.drawable.Drawable;

import java.util.Date;

public class Noticia {
    public int id;
    public String titulo;
    public Integer urlImagem;
    public String corpoTexto;
    public Date dataPublicacao;
    public String autorTexto;


    public Noticia(int id, String titulo, Integer urlImagem, String corpoTexto, Date dataPublicacao, String autorTexto) {
        this.autorTexto = autorTexto;
        this.corpoTexto = corpoTexto;
        this.urlImagem = urlImagem;
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(Integer urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getCorpoTexto() {
        return corpoTexto;
    }

    public void setCorpoTexto(String corpoTexto) {
        this.corpoTexto = corpoTexto;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutorTexto() {
        return autorTexto;
    }

    public void setAutorTexto(String autorTexto) {
        this.autorTexto = autorTexto;
    }
}
