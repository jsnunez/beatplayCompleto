package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class ListarJugadores {
    public static Controller controlador;

    public void start(Scanner sc) {

        Enumeration<String> playerKeys = controlador.jugadores.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: "+ playerKey + " Nombre del jugador: "+
                        controlador.jugadores.get(playerKey).getNombre());
        }

    }

}
