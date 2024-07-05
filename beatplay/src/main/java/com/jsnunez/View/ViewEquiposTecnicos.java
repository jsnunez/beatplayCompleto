package com.jsnunez.View;

import java.util.Scanner;

public class ViewEquiposTecnicos {

    public static int start(Scanner sc) {

        System.out.println("    ERES EL MEJOR TECNICO DEL EQUIPO!");
        System.out.println();
        System.out.println("      1.Gestión de Jugadores");
        System.out.println("      2.Visualización de Estadísticas");
        System.out.println("      3.Gestión de Entrenadores");
        System.out.println("      4.Generación de Informes");
        System.out.println("      5.Consulta de Calendario de Partidos");
        System.out.println("      6.Gestión de Lesiones de Jugadores");
        System.out.println("      7.Gestión de Entrenamientos");
        System.out.println("      8.Seguimiento de Rendimiento de Jugadores");
        System.out.println("      9.Gestión de Transferencias de Jugadores");
        System.out.println("      10.Gestión de Equipamiento");
        System.out.println("      11.Gestión de Convocatorias de Jugadores");
        System.out.println("      12.Salir");

        int opcion =sc.nextInt();
        sc.nextLine();
return(opcion);
    }

}
