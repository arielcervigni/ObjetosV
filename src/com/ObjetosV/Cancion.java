package com.ObjetosV;

public class Cancion {

    // Se nos pide armar un programa similar a Spotify que nos permitirá administrar nuestras listas de reproducción.

    // Para ello deberemos generar una clase Canción la cual posee un nombre, la duración de la canción, genero
    // (el cual solo podrá ser ROCK, TRAP, JAZZ, HIP HOP, POP, METAL y CLASICA),
    // el Álbum al que pertenece y a veces un artista invitado si es que tiene.

    private String tituloCancion;
    private Float duracion;
    private String genero;
    private Artista artistaInvitado;
    private Album album;
    private Artista artista;

    public Cancion(String tituloCancion, Float duracion, String genero, Artista artistaInvitado, Album album, Artista artista) {

        this.tituloCancion = tituloCancion;
        this.duracion = duracion;
        this.genero = genero;
        this.artistaInvitado = artistaInvitado;
        this.album = album;
        this.artista = artista;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }
    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }
    public Float getDuracion() {
        return duracion;
    }
    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }
    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        if (artistaInvitado != null) {
            return  "Titulo: '" + tituloCancion + '\'' +
                    ". Duración:" + duracion +
                    ". Género:" + genero + '\'' +
                    ". Artista Invitado=" + artistaInvitado.toString()
                    + artista.toString() + album.toString();
        }
        else
        {
            return  "Título: '" + tituloCancion + '\'' +
                    ". Duración: " + duracion +
                    ". Género: '" + genero + artista.toString() + album.toString();
        }
    }
}
