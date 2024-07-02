package com.jsnunez.View;

import java.util.Scanner;

public class ViewGestionmedioC {

    public static int start(Scanner sc) {
            System.out.println("       ¡MODULO DE GESTION MEDIOS!     ");
            System.out.println("    1. Agregar nuevo gestion medios.");
            System.out.println("    2. Editar un gestion medios.");
            System.out.println("    3. Eliminar un gestion medios.");
            System.out.println("    4. Listar gestion medioss.");
            System.out.println("    5. Salir.");

            int opcion = sc.nextInt();

            sc.nextLine();
            switch (opcion) {
                    case 1:
                            System.out.println("    ¡CREACION DE UN NUEVO MEDIO DE COMUNICACIÓN.!");

                            break;

                    case 2:
                            System.out.println("   EDITAR MEDIO DE COMUNICACIÓN.");

                            break;

                    case 3:
                            System.out.println("    ELIMINAR MEDIO DE COMUNICACIÓN.");

                            break;
                    case 4:
                            System.out.println("    LISTAR MEDIO DE COMUNICACIÓN.");

                            break;

                    case 5:

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


