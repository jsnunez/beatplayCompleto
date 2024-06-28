package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class CrearEquipo {
    public static Controller controlador;

    public static void start(Scanner sc) {

        Team equipo = new Team();

        System.out.println("Ingrese id del equipo");
        String id = sc.nextLine();
        if (controlador.equipos.containsKey(id)) {
            System.out.println("El código del equipo ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese nombre del equipo");
            String nombre = sc.nextLine();
            System.out.println("Ingresa la Ciudad.");
            String ciudad = sc.nextLine();

            equipo.setId(id);
            equipo.setNombre(nombre);
            equipo.setCiudad(ciudad);
            controlador.equipos.put(id, equipo);
        }
    }
}