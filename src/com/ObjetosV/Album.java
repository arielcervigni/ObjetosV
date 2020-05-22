package com.ObjetosV;

public class Album extends Artista{

    // Álbum posee el año en que fue publicado, un título y conoce su Artista.

    private int año;
    private String tituloAlbum;
    //private Artista artista;

    public Album(String nombre, int edad, String nacionalidad, int año, String titulo) {
        super(nombre, edad, nacionalidad);
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
                ". Año:" + año + super.toString();
    }
}
