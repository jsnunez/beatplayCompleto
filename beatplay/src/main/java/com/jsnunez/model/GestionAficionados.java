package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionAficionados {
    public static Controller controlador;

    public static void visualizacion(Scanner sc) {

        System.out.println("Seleccione tipo de estadistica:");
        System.out.println("1. Jugador");
        System.out.println("2. Equipos");
        System.out.println("3. Temporada");
        int opciontipo = sc.nextInt();
        sc.nextLine();
        switch (opciontipo) {
            case 1:
                GestionJugador.ListarJugadores();
                System.out.println("selecione Id jugador:");
                String idjugador = sc.nextLine();
                Enumeration<String> playerKeys = controlador.goles.keys();
                int goles = 0;
                while (playerKeys.hasMoreElements()) {
                    String playerKey = playerKeys.nextElement();
                    if (controlador.goles.get(playerKey).getJugador().getId().equals(idjugador)) {
                        goles++;
                    }
                }
                System.out.println("total de goles: " + goles);
                Enumeration<String> tarjetas = controlador.goles.keys();
                int tarjeta = 0;
                while (tarjetas.hasMoreElements()) {
                    String playerKey = tarjetas.nextElement();
                    if (controlador.tarjetas.get(playerKey).getJugador().getId().equals(idjugador)) {
                        tarjeta++;
                    }
                }
                System.out.println("total de tarjetas: " + tarjeta);
                break;
            case 2:

                break;
            case 3:

        break;
            default:
                break;
        }

    }

}
