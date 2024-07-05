package com.jsnunez.model;

import java.util.Scanner;

import com.jsnunez.View.ViewGestionJugadores;

public class GestionCompletaJugadores {

    public static void star(Scanner sc) {
        ViewGestionJugadores gj = new ViewGestionJugadores();

        GestionJugador gunj = new GestionJugador();
        int opcionJugadores;
        do {
            opcionJugadores = gj.start(sc);
            switch (opcionJugadores) {
                case 1:
                    gunj.CrearJugador(sc);
                    break;

                case 2:
                    gunj.EditarJugador(sc);
                    break;

                case 3:
                    gunj.EliminarJugador(sc);
                    break;
                case 4:
                    gunj.ListarJugadores();
                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError();

            }
        } while (opcionJugadores != 5);

    }

}
