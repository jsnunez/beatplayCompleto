package com.jsnunez.model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import bet.Controller;

public class GestionJugador {
    public static Controller controlador;

    public static void CrearJugador(Scanner sc) {

        Player jugador = new Player();

        System.out.println("Ingresa el ID del jugador");
        String id = sc.nextLine();
        if (controlador.jugadores.containsKey(id)) {
            System.out.println("El código del Jugador ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = sc.nextLine();
            // System.out.println("Apellido");
            // String apellido = sc.nextLine();
            System.out.println("Edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Posicion.");
            String posicion = sc.nextLine();
            System.out.println("Nacionalidad");
            String nacionalidad = sc.nextLine();
            System.out.println("Numero de camiseta");
            int numeroCamisetas = sc.nextInt();
            sc.nextLine();
            System.out.println("Seleccione Equipo");
            ListarEquipos();
            String equipoSeleccionar = sc.nextLine();
            Team equipo = new Team();
            equipo = controlador.equipos.get(equipoSeleccionar);
            System.out.println(controlador.equipos.get(equipoSeleccionar).getNombre());
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
ListarJugadores();

        Player jugadores = new Player();
        System.out.println("Ingrese el ID del jugador a editar.");
        String id = sc.nextLine();
        while (!controlador.jugadores.containsKey(id) | id == "salir") {
            System.out.println("Opcion no valida seleccione un jugador existente para continuar o escriba salir");
            id = sc.nextLine();
            if (id.equals("salir")) {
                break;
            }
        }
        if (id.equals("salir")) {
        } else {
            System.out.println("Ingrese el nombre del Jugador");
            String nombre = sc.nextLine();
            System.out.println("Edad");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Nueva Posicion");
            String posicion = sc.nextLine();
            System.out.println("Nacionalidad.");
            String nacionalidad = sc.nextLine();
            System.out.println("Numero de camiseta");
            int numeroCamisetas = sc.nextInt();
            sc.nextLine();

            System.out.println("desea cambiar jugador de equipo");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcionCambio = sc.nextInt();
            sc.nextLine();
            if (opcionCambio == 1) {
                ListarEquipos();
                System.out.println("seleccione ID del equipo a cambiar el jugador");

                String equipoSeleccionar = sc.nextLine();
                Team equipo = new Team();
                equipo = controlador.equipos.get(equipoSeleccionar);
                Team equipoActual = new Team();
                equipoActual = controlador.equipos.get(controlador.jugadores.get(id).getEquipo().getId());
                System.out.println(controlador.equipos.get(equipoSeleccionar).getNombre());
                jugadores.setId(id);
                jugadores.setNombre(nombre);
                jugadores.setEdad(edad);
                jugadores.setPosicion(posicion);
                jugadores.setNacionalidad(nacionalidad);
                jugadores.setNumeroCamisetas(numeroCamisetas);
                jugadores.setEquipo(equipo);
                equipo.setListJugadores(jugadores);
                controlador.jugadores.put(id, jugadores);
                controlador.equipos.put(equipoSeleccionar, equipo);

                System.out.println(equipoActual.getNombre());
                List<Player> listJugadores = new ArrayList<Player>();
                listJugadores = equipoActual.getListJugadores();
                int con = -1;
                int ubicaionlista=-1;

         
                for (Player n : listJugadores) {
                    con++;
                    if (id.equals(n.getId())) {
                       ubicaionlista=con;
                    }

                }
                if (ubicaionlista>=0) {
                    System.out.println("jugador en posicion"+ubicaionlista);
                    listJugadores.remove(ubicaionlista);
                    equipoActual.modiListjugador(listJugadores);
                    controlador.equipos.put(equipoActual.getId(), equipoActual);
                }
               

       
            }

        }
    }

    public static void EliminarJugador(Scanner sc) {
        ListarJugadores();

        System.out.println("Ingrese el codigo del Jugador a ELIMINAR: ");
        String codigoJ1 = sc.nextLine();
        Player jt = controlador.jugadores.get(codigoJ1);
        Player je = controlador.jugadores.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getNombre() + " ah sido ELIMINADO correctamente.");
            Team equipoActual = new Team();
                equipoActual = controlador.equipos.get(jt.getEquipo().getId());
                List<Player> listJugadores = new ArrayList<Player>();
                listJugadores = equipoActual.getListJugadores();
                int con = -1;
                int ubicaionlista=-1;

         
                for (Player n : listJugadores) {
                    con++;
                    if (je.getId().equals(n.getId())) {
                       ubicaionlista=con;
                    }

                }
                if (ubicaionlista>=0) {
                    System.out.println("jugador en posicion"+ubicaionlista);
                    listJugadores.remove(ubicaionlista);
                    equipoActual.modiListjugador(listJugadores);
                    controlador.equipos.put(equipoActual.getId(), equipoActual);
                }
               


        } else {
            System.out.println("Jugador no encontrado");
        }
    }

    public static void ListarJugadores() {

        Enumeration<String> playerKeys = controlador.jugadores.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey + " Nombre del jugador: " +
                    controlador.jugadores.get(playerKey).getNombre() + " Equipo  "
                    + controlador.jugadores.get(playerKey).getEquipo().getNombre());
        }

    }

    public static void ListarEquipos() {
        Enumeration<String> teamKeys = controlador.equipos.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                    controlador.equipos.get(teamKey).getNombre());
        }
    }

}
