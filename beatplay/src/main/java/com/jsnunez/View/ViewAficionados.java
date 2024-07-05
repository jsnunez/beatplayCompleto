package com.jsnunez.View;

import java.util.Scanner;

public class ViewAficionados {

    public static int start(Scanner sc) {

        System.out.println("    ERES EL MEJOR AFICIONADO!");
        System.out.println();
        System.out.println("      1. Visualización de Estadísticas");
        System.out.println("      2. Venta de Entradas");
        System.out.println("      3. Calendario de Partidos");
        System.out.println("      4. Salir");
        int opcion =sc.nextInt();
        sc.nextLine();
return(opcion);
    }

}
