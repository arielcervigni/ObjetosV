package com.ObjetosV;

public class Album {

    // Álbum posee el año en que fue publicado, un título y conoce su Artista.

    private int año;
    private String tituloAlbum;


    public Album(String titulo, int año) {
        this.año = año;
        this.tituloAlbum = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }
    public int getAño() {
        return año;
    }
    public String getTituloAlbum() {
        return tituloAlbum;
    }

    @Override
    public String toString() {
        return ". Titulo de Album:'" + tituloAlbum + '\'' +
                ". Año:" + año;
    }
}
