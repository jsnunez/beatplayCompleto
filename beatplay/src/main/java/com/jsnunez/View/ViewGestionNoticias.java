package com.jsnunez.View;

import java.util.Scanner;

public class ViewGestionNoticias {

    public static int start(Scanner sc) {
        System.out.println("       ¡MODULO DE NOTICIAS Y COMUNICADOS!     ");
        System.out.println("    1. Agregar nueva noticia/comunicado.");
        System.out.println("    2. ver noticia/comunicado.");
        System.out.println("    3. publicar noticia/comunicado.");
        System.out.println("    4. editar noticia/comunicado.");
        System.out.println("    5. eliminar noticia/comunicado.");
        System.out.println("    6. Salir.");

        int opcion = sc.nextInt();

        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("    ¡CREACION DE UNA NUEVA NOTICIA/COMUNICADO!");

                break;

            case 2:
                System.out.println("   VER NOTICIA O COMUNICADOS");

                break;

            case 3:
                System.out.println("    PUBLICAR NOTICA O COMUNICADO");

                break;
            case 4:
                System.out.println("    EDITAR NOTICIA O COMUNICADO");

                break;
                case 5:
                System.out.println("    ELIMINAR NOTICIA O COMUNICADO");

                break;
            case 6:

                System.out.println(
                        "   ______    _______  _______  ______    _______  _______  _______  __    _  ______   _______ ");
                System.out.println(
                        "  |    _ |  |       ||       ||    _ |  |       ||       ||   _   ||  |  | ||      | |       |");
                System.out.println(
                        "  |   | ||  |    ___||    ___||   | ||  |    ___||  _____||  |_|  ||   |_| ||  _    ||   _   |");
                System.out.println(
                        "  |   |_||_ |   |___ |   | __ |   |_||_ |   |___ | |_____ |       ||       || | |   ||  | |  |");
                System.out.println(
                        "  |    __  ||    ___||   ||  ||    __  ||    ___||_____  ||       ||  _    || |_|   ||  |_|  |");
                System.out.println(
                        "  |   |  | ||   |___ |   |_| ||   |  | ||   |___  _____| ||   _   || | |   ||       ||       |");
                System.out.println(
                        "  |___|  |_||_______||_______||___|  |_||_______||_______||__| |__||_|  |__||______| |_______|");

                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return opcion;

    }
}