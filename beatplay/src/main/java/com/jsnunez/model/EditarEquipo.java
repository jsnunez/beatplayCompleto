package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class EditarEquipo {
    public static Controller controlador;

    public void start(Scanner sc) {
        Enumeration<String> teamKeyse = controlador.equipos.keys();
        while (teamKeyse.hasMoreElements()) {
            String teamKeye = teamKeyse.nextElement();
            System.out.println("Key: " + teamKeye + " Nombre del equipo: " +
                    controlador.equipos.get(teamKeye).getNombre());
        }
        Team equipo = new Team();
        System.out.println("seleccione ID del equipo a editar");
        String id = sc.nextLine();
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
