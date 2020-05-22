package com.ObjetosV;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeReproduccion implements Reproduccion {

    private ArrayList <Cancion> canciones;
    private Cancion unaCancion;

    public ListaDeReproduccion(ArrayList<Cancion> canciones,Cancion unaCancion) {
        this.canciones = canciones;
        this.unaCancion = unaCancion;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Cancion getUnaCancion() {
        return unaCancion;
    }

    public void setUnaCancion(Cancion unaCancion) {
        this.unaCancion = unaCancion;
    }

    @Override
    public void reproducir() {
        System.out.println("Soy " + this.unaCancion.toString() + " y me estoy reproduciendo. ");
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

    @Override
    public void cambiarCancion() {
        posCancion();

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
