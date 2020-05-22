package com.ObjetosV;

public class Artista {

    // Artista a su vez posee un nombre, su edad y la nacionalidad.

    protected String nombre;
    protected int edad;
    protected String nacionalidad;

    public Artista(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return  ". Artista: '" + nombre + '\'' +
                ". Edad:" + edad +
                ". Nacionalidad:'" + nacionalidad + '\'';
    }
}
