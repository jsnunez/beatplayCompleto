package com.jsnunez.model;

import java.util.Scanner;

public class CrearEquipo {
    public static void start(Scanner sc) {

        Team equipo = new Team();

        System.out.println("Ingrese id del equipo");
        String id = sc.nextLine();
        System.out.println("Ingrese nombre del equipo");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la Ciudad.");
        String ciudad = sc.nextLine();

        equipo.setId(id);
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);

        System.out.println();
        System.out.println(equipo.getNombre());
    }
}