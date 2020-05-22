package com.ObjetosV;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeReproduccion implements Reproduccion {

    private ArrayList <Cancion> canciones;

    public ListaDeReproduccion(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public void reproducir() {
        int i = posCancion();
        System.out.println("Soy " + canciones.get(i).toString() + " y me estoy reproduciendo. ");
    }

    @Override
    public void agregarCancion(Cancion nuevaCancion) {
        canciones.add(nuevaCancion);
    }

    @Override
    public void eliminarCancion() {
        verMiLista();
        int i = posCancion();
        this.canciones.remove(i);
    }

    @Override
    public void verMiLista() {
        int i = 1;
        for (Cancion c : this.canciones)
        {
            System.out.println(i+". "+c);
            i++;
        }
    }

    public int posCancion ()
    {
        Scanner scan = new Scanner(System.in);
        int rta = 0;
        System.out.print("\n Ingrese el número de la cancion que desea buscar.");
        rta = scan.nextInt();
        rta--;
        return rta;
    }
}
