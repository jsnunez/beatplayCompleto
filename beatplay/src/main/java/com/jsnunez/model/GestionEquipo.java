package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionEquipo {
public static Controller controlador;

    public static void CrearEquipo(Scanner sc) {

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
            sc.nextLine();
        }
    }

    public void EditarEquipo(Scanner sc) {
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
        sc.nextLine();
    } 
    
    public static void EliminarEquipo(Scanner sc) {
        System.out.println("Ingrese codigo del equipo a eliminar: ");
        String codigoEl = sc.nextLine();
        Team ee = controlador.equipos.remove(codigoEl);
        if (ee != null) {
            System.out.println("El equipo eliminado fue " + ee.getNombre());
        } else {
            System.out.println("equipo no encontrado.");
        }

    } public void ListarEquipos(Scanner sc) {

        Enumeration<String> teamKeys = controlador.equipos.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                    controlador.equipos.get(teamKey).getNombre());
        }

        sc.nextLine();
    }
}
