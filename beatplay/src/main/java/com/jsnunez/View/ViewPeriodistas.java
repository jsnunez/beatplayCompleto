package com.jsnunez.View;

import java.util.Scanner;

public class ViewPeriodistas {

    public static int start(Scanner sc) {

        System.out.println("    ERES EL MEJOR PERIODISTA!");
        System.out.println();
        System.out.println("        1.Visualización de Estadísticas");
        System.out.println("        2.Gestión de Noticias y Comunicados");
        System.out.println("        3.Consulta de Calendario de Partidos");
        System.out.println("        4.Gestión de Relaciones Públicas");
        System.out.println("        5.Salir");

        int opcion =sc.nextInt();
        sc.nextLine();
return(opcion);
    }

}
