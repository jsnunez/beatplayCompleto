package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class CrearJugadores {
    public static Controller controlador;

    public static void start(Scanner sc) {

        Player jugador = new Player();

        System.out.println("Ingresa el ID del jugador");
        String id = sc.nextLine();
        if (controlador.jugadores.containsKey(id)) {
            System.out.println("El código del Jugador ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = sc.nextLine();
            System.out.println("Apellido");
            String apellido = sc.nextLine();
            System.out.println("Edad:");
            int edad = sc.nextInt();
            System.out.println("Posicion.");
            String posicion = sc.nextLine();
            System.out.println("Nacionalidad");
            String nacionalidad = sc.nextLine();
            System.out.println("Numero de camiseta");
            int numeroCamisetas = sc.nextInt();
            System.out.println("Seleccione Equipo");
                Enumeration<String> teamKeys = controlador.equipos.keys();

                    while (teamKeys.hasMoreElements()) {
                        String teamKey = teamKeys.nextElement();
                        System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                                controlador.equipos.get(teamKey).getNombre());
                    }
                    String equipoSeleccionar = sc.nextLine();
Team equipo = new Team();
equipo=controlador.equipos.get(equipoSeleccionar);
            jugador.setId(id);
            jugador.setNombre(nombre);
            jugador.setEdad(edad);
            jugador.setPosicion(posicion);
            jugador.setNacionalidad(nacionalidad);
            jugador.setNumeroCamisetas(numeroCamisetas);
            jugador.setEquipo(equipo);
            controlador.jugadores.put(id, jugador);
            equipo.setListJugadores(jugador);
            controlador.equipos.put(equipoSeleccionar, equipo);
            
            
        }

    }

}
