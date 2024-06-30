package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionJugador {
public static Controller controlador;

    public static void CrearJugador(Scanner sc) {

        Player jugador = new Player();

        System.out.println("Ingresa el ID del jugador");
        String id = sc.nextLine();
        // if (controlador.jugadores.containsKey(id)) {
        //     System.out.println("El código del Jugador ya existe. Por favor, intente con otro código.");
        // } else 
        {
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = sc.nextLine();
            // System.out.println("Apellido");
            // String apellido = sc.nextLine();
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

    public static void EditarJugador(Scanner sc) {
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
    public static void EliminarJugador(Scanner sc){
        System.out.println("Ingrese el codigo del Jugador a ELIMINAR: ");
        String codigoJ1 =sc.nextLine();
        Player je = controlador.jugadores.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getNombre()+" ah sido ELIMINADO correctamente.");
        } else{
            System.out.println("Jugador no encontrado");
        }
    }
    public void ListarJugadores(Scanner sc) {

        Enumeration<String> playerKeys = controlador.jugadores.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: "+ playerKey + " Nombre del jugador: "+
                        controlador.jugadores.get(playerKey).getNombre());
        }

    }

}
