package com.ObjetosV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Artista invitado1 = new Artista("Artistainvitado1",40,"EEUU");
        Artista invitado2 = new Artista("Artistainvitado1",35,"Peru");
        Artista artista1 = new Artista("Artista1",50,"Argentina");
        Artista artista2 = new Artista("Artista2",51,"Brasil");
        Artista artista3 = new Artista("Artista3",52,"Francia");
        Artista artista4 = new Artista("Artista4",53,"Chile");
        Artista artista5 = new Artista("Artista5",54,"Jamaica");

        Album album1 = new Album("Album1", 2000);
        Album album2 = new Album("Album2", 2005);
        Album album3 = new Album("Album3", 1998);

        Cancion cancion1 = new Cancion("Cancion1", 2.02f,"ROCK", null, album1,artista1);
        Cancion cancion2 = new Cancion("Cancion2", 3.12f,"POP", invitado1, album1,artista1);
        Cancion cancion3 = new Cancion("Cancion3", 1.02f,"HIP HOP", null, album1,artista1);
        Cancion cancion4 = new Cancion("Cancion4", 2.45f,"JAZZ", invitado2, album1,artista1);
        Cancion cancion5 = new Cancion("Cancion5", 3.45f,"ROCK", null, album1,artista1);
        Cancion cancion6 = new Cancion("Cancion6", 3.21f,"POP", invitado1, album1,artista1);
        Cancion cancion7 = new Cancion("Cancion7", 2.46f,"HIP HOP", invitado2, album1,artista1);
        Cancion cancion8 = new Cancion("Cancion8", 3.01f,"ROCK", null, album1,artista1);

        // Agrego las canciones al arrayList
        ArrayList <Cancion> canciones = new ArrayList<>();
        int i = 0;
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        canciones.add(cancion5);
        canciones.add(cancion6);
        canciones.add(cancion7);

        /*
        // Genero Lista de Reproduccion
        ListaDeReproduccion lista = new ListaDeReproduccion(canciones,null);

        System.out.println("VER LISTA:");
        lista.verMiLista();

        System.out.println("AGREGAR CANCIÓN:");
        lista.agregarCancion(cancion8);
        lista.verMiLista();


        System.out.println("REPRODUCIR CANCIÓN:");
        i = lista.posCancion();
        lista.setUnaCancion(canciones.get(i));
        lista.reproducir();


        System.out.println("ELIMINAR CANCIÓN:");
        //lista.eliminarCancion();
        //i = lista.posCancion();
        lista.eliminarCancion();

        lista.verMiLista();

         */

        Stack<Cancion> miLista = new Stack<>();
        miLista.addAll(canciones);

        ListaBasica listaBasica = new ListaBasica("Mi Lista",miLista,null);

        listaBasica.verMiLista();

    }
}
