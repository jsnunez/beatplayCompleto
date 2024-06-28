package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class EliminarJugadores {
    public static Controller controlador;

    public static void start(Scanner sc){
        System.out.println("Ingrese el codigo del Jugador a ELIMINAR: ");
        String codigoJ1 =sc.nextLine();
        Player je = controlador.jugadores.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getNombre()+" ah sido ELIMINADO correctamente.");
        } else{
            System.out.println("Jugador no encontrado");
        }
    }

}
