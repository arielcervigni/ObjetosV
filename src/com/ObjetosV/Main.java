package com.ObjetosV;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Cancion> canciones = new ArrayList<>();

        Cancion arco = new Cancion("Los Piojos", 50, "Argentina", 1995, "Verde Paisajes","Arco", 3.45f,"ROCK", null );
        Cancion enLosBares = new Cancion ("Pappo", 65, "Argentina", 2007, "Buscando un amor","En los bares", 2.41f, "ROCK", null);

        canciones.add(arco);
        //canciones.add(enLosBares);

        ListaDeReproduccion lista = new ListaDeReproduccion(canciones);

        //System.out.println("VER LISTA:");
        //lista.verMiLista();
        System.out.println("AGREGAR CANCIÓN:");
        lista.agregarCancion(enLosBares);
        lista.agregarCancion(enLosBares);
        lista.agregarCancion(enLosBares);
        lista.agregarCancion(enLosBares);

        System.out.println("ELIMINAR CANCIÓN:");
        lista.eliminarCancion();
        System.out.println("VER LISTA:");
        lista.verMiLista();

        lista.reproducir();
    }
}
