package com.jsnunez.model;

import java.util.Scanner;

import com.jsnunez.View.ViewGestionEntrenadores;

public class GestionCompletaEntrenadores {

    public static void star (Scanner sc) {

        ViewGestionEntrenadores vge = new ViewGestionEntrenadores();

        GestionEntrenadores gen = new GestionEntrenadores();
        int opcionEntrenadores;
        do {
            opcionEntrenadores = vge.start(sc);
            switch (opcionEntrenadores) {
                case 1:
                    gen.CrearEntrenador(sc);
                    break;

                case 2:
                    gen.EditarEntrenador(sc);
                    break;

                case 3:
                    gen.EliminarEntrenador(sc);

                case 4:
                    gen.ListarEntrenadores();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("seleccione una opcion valida");

            }
        } while (opcionEntrenadores != 5);
        

    }

}
