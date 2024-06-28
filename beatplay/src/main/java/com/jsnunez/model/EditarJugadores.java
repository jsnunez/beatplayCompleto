package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class EditarJugadores {
    public static Controller controlador;

    public static void start(Scanner sc) {
        Enumeration<String> playerKeyse = controlador.jugadores.keys();
        while (playerKeyse.hasMoreElements()) {
            String playerKeye = playerKeyse.nextElement();
            System.out.println("Key: " + playerKeye + "Nombre del Jugador: " +
                    controlador.jugadores.get(playerKeye).getNombre());

        }
        Player jugadores = new Player();
        System.out.println("Ingrese el ID del jugador a editar.");
        String id =sc.nextLine();
        System.out.println("Ingrese el nombre del Jugador");
        String nombre =sc.nextLine();
        System.out.println("Edad");
        int edad =sc.nextInt();
        System.out.println("Nueva Posicion");
        String posicion =sc.nextLine();
        System.out.println("Nacionalidad.");
        String nacionalidad =sc.nextLine();
        System.out.println("Numero de camiseta");
        int numeroCamisetas =sc.nextInt();
        

        jugadores.setId(id);
        jugadores.setNombre(nombre);
        jugadores.setEdad(edad);
        jugadores.setPosicion(posicion);
        jugadores.setNacionalidad(nacionalidad);
        jugadores.setNumeroCamisetas(numeroCamisetas);
        controlador.jugadores.put(id, jugadores);
        
    }

}
