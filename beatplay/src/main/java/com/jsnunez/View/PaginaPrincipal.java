package com.jsnunez.View;

import java.util.Scanner;

public class PaginaPrincipal {

    public static int  start(Scanner sc) {

        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Salir");

        int opcion = sc.nextInt();
sc.nextLine();
switch (opcion) {
    case 1:
    System.out.println("bienvenido al inicio de Sesion");
        break;
        case 2:
        System.out.println("saliendo del programa");
            break;
    default:
    System.out.println("Error valor no valido");
        break;
}
   
return opcion;
    }
}
