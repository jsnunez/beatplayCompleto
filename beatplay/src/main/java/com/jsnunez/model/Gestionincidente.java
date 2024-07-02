package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import com.jsnunez.model.GestionEntrenadores.controlador;

import bet.Controller;

public class Gestionincidente {

    public static Controller controlador;

    public static void CrearIncidente(Scanner sc) {

        System.out.println("id incidente");
        String idIncidente = sc.nextLine();
        GestionPartido.ListarPartidos();
        System.out.println("Seleccionar id partido de la lista");
        String idpartido = sc.nextLine();
        Partido partido = new Partido();
        partido = controlador.partidos.get(idpartido);
        System.out.println("Descripcion incidente");
        String descripcion = sc.nextLine();
        System.out.println("minuto");
        String minuto = sc.nextLine();
        Incidente incidente = new Incidente(idIncidente, partido, descripcion, minuto);
        controlador.incidentes.put(idIncidente, incidente);

    }

    public static void ListarIncidente() {

        Enumeration<String> playerKeys = controlador.incidentes.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("ID: " + playerKey +
                    " Id partido: " + controlador.incidentes.get(playerKey).getPartido().getId() +
                    " Descripcion: " + controlador.incidentes.get(playerKey).getDescripcion() +
                    " Minuto: " + controlador.incidentes.get(playerKey).getMinuto());
        }

    }
}
