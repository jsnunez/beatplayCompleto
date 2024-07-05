package com.jsnunez.View;

import java.util.Scanner;

public class ViewMedicosDelEquipos {

    public static int star(Scanner sc) {

        System.out.println("    ERES EL MEJOR MEDICO!");
        System.out.println();
        System.out.println("      1.Gestión de Lesiones de Jugadores");
        System.out.println("      2.Gestión de Medios de Comunicación");
        System.out.println("      3.Salir");
        

        int opcion =sc.nextInt();
        sc.nextLine();
return(opcion);
    }

}
