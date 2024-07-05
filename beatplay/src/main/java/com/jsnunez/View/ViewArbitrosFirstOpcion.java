package com.jsnunez.View;

import java.util.Scanner;

public class ViewArbitrosFirstOpcion {

    public static int star(Scanner sc) {

        System.out.println("    ERES EL MEJOR ARBITRO!");
        System.out.println();
        System.out.println("      1.Registro de Resultados");
        System.out.println("      2.Gestión de Incidentes y Sanciones");
        System.out.println("      3.Salir");
        int opcion =sc.nextInt();
        sc.nextLine();
return(opcion);
    }

}
