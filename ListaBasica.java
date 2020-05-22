package com.ObjetosV;

import java.util.Stack;

public class ListaBasica implements Reproduccion {

    // Posee como atributo nombre, y un objeto de tipo Stack llamado miLista donde se
    //guardarán las canciones.
    // Los métodos eliminarCancion y cambiarCancion no deben permitirle al usuario
    // eliminar o cambiar de canción, sino que deben decirle el siguiente mensaje:
    //“Para acceder a estas opciones, compre el paquete PREMIUM”.
    //El método Reproducir solo reproducirá la primera canción del stack y la enviará al
    //final del mismo.


    private String nombreLista;
    private Stack<Cancion> miLista;
    private Cancion unaCancion;


    public ListaBasica(String nombreLista, Stack<Cancion> canciones, Cancion unaCancion) {
        this.nombreLista = nombreLista;
        this.miLista = canciones;
        this.unaCancion = unaCancion;
    }

    @Override
    public void reproducir() {
        System.out.println("Soy " + this.unaCancion.toString() + " y me estoy reproduciendo. ");
    }

    @Override
    public void agregarCancion(Cancion nuevaCancion) {
        this.miLista.push(nuevaCancion);
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void cambiarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }


    @Override
    public void verMiLista() {
        int i;
        for (i= 0; i<miLista.size(); i++)
            {
                System.out.println(i+". "+miLista.get(i).toString());
            }
    }
}
