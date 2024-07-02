package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionPartido {
    public static Controller controlador;

    public static void CrearPartido(Scanner sc) {

        Partido partido = new Partido();

        System.out.println("Ingrese id del partido");
        String id = sc.nextLine();
        if (controlador.partidos.containsKey(id)) {
            System.out.println("El código del partido ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese id del equipo local");
            String equipoLocal = sc.nextLine();
            System.out.println(controlador.equipos.get(equipoLocal).getNombre());
            System.out.println("Ingrese id del equipo visitante");
            String equipoVisitante = sc.nextLine();
            System.out.println(controlador.equipos.get(equipoVisitante).getNombre());

            System.out.println("Ingrese fecha del partido");
            String fecha = sc.nextLine();

            System.out.println("Ingrese hora del partido");
            String hora = sc.nextLine();

            System.out.println("Ingrese id estadio del partido");

            String idEstadio = sc.nextLine();

            System.out.println(controlador.estadios.get(idEstadio).getNombre());

            partido.setId(id);
            partido.setEquipoLocal(controlador.equipos.get(equipoLocal));
            partido.setEquipoVisitante(controlador.equipos.get(equipoVisitante));
            partido.setFecha(fecha);
            partido.setHora(hora);
            partido.setEstadio(controlador.estadios.get(idEstadio));

            controlador.partidos.put(id, partido);
        }
    }

    public static void EditarPartido(Scanner sc) {
        Partido partido = new Partido();
        Enumeration<String> teamKeys = controlador.partidos.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            System.out.println("Key: " + teamKey + " Nombre del equipo equipo visitante es: " +
                    controlador.partidos.get(teamKey).getEquipoLocal().getNombre());
            System.out.println("Key: " + teamKey + " Nombre del equipo equipo local es: " +
                    controlador.partidos.get(teamKey).getEquipoVisitante().getNombre());
            System.out.println("Key: " + teamKey + " Estadio donde se va jugar el partido: " +
                    controlador.partidos.get(teamKey).getEquipoVisitante().getNombre());
        }
        System.out.println("Ingrese id del partido a editar");
        String id = sc.nextLine();

        System.out.println("Ingrese id del equipo local");
        String equipoLocal = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoLocal).getNombre());
        System.out.println("Ingrese id del equipo visitante");
        String equipoVisitante = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoVisitante).getNombre());

        System.out.println("Ingrese fecha del partido");
        String fecha = sc.nextLine();

        System.out.println("Ingrese hora del partido");
        String hora = sc.nextLine();

        System.out.println("Ingrese id estadio del partido");

        String idEstadio = sc.nextLine();

        System.out.println(controlador.estadios.get(idEstadio).getNombre());

        partido.setId(id);
        partido.setEquipoLocal(controlador.equipos.get(equipoLocal));
        partido.setEquipoVisitante(controlador.equipos.get(equipoVisitante));
        partido.setFecha(fecha);
        partido.setHora(hora);
        partido.setEstadio(controlador.estadios.get(idEstadio));

        controlador.partidos.put(id, partido);

    }

    public static void EliminarPartido(Scanner sc) {
        System.out.println("Ingrese el codigo del Partido a ELIMINAR: ");
        String codigoJ1 = sc.nextLine();
        Partido je = controlador.partidos.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getId() + " ah sido ELIMINADO correctamente.");
        } else {
            System.out.println("Jugador no encontrado");
        }
    }

    public static void ListarPartidos() {

        Enumeration<String> playerKeys = controlador.partidos.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Equipo local: " + controlador.partidos.get(playerKey).getEquipoLocal().getNombre() +
                    " Equipo visitante: " + controlador.partidos.get(playerKey).getEquipoVisitante().getNombre() +
                    " Fecha: " + controlador.partidos.get(playerKey).getFecha()+
                    " Estadio: "+ controlador.partidos.get(playerKey).getEstadio().getNombre());
        }

    }
}
