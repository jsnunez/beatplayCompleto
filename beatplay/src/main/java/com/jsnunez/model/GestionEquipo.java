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

            Enumeration<String> teamKeys = controlador.estadios.keys();

            while (teamKeys.hasMoreElements()) {
                String teamKey = teamKeys.nextElement();
                System.out.println("Key: " + teamKey + " Nombre del estadio: " +
                        controlador.estadios.get(teamKey).getNombre()
                        + controlador.estadios.get(teamKey).getUbicacion());
            }

            System.out.println("Ingresa eL id estadio.");
            String idEstadio = sc.nextLine();
            estadio estadio = new estadio();
            while (!controlador.estadios.containsKey(idEstadio)) {
                System.out.println("Opcion no valida seleccione un estadio existente para continuar ");
                idEstadio = sc.nextLine();
            }
            estadio = controlador.estadios.get(idEstadio);
            equipo.setId(id);
            equipo.setNombre(nombre);
            equipo.setCiudad(ciudad);
            controlador.equipos.put(id, equipo);

        }
    }

    public void EditarEquipo(Scanner sc) {
        Enumeration<String> teamKeyse = controlador.equipos.keys();
        while (teamKeyse.hasMoreElements()) {
            String teamKeye = teamKeyse.nextElement();
            System.out.println("Key: " + teamKeye + " Nombre del equipo: " +
                    controlador.equipos.get(teamKeye).getNombre() + " Ubicacion: " +
                    controlador.equipos.get(teamKeye).getCiudad() + " estadio: " +
                    controlador.equipos.get(teamKeye).getEstadio().getNombre());
        }
        System.out.println("seleccione ID del equipo a editar");
        String id = sc.nextLine();

        if (controlador.equipos.containsKey(id)) {
            Team equipo = new Team();

            System.out.println("Ingrese nombre del equipo");
            String nombre = sc.nextLine();
            System.out.println("Ingresa la Ciudad.");
            String ciudad = sc.nextLine();
            System.out.println("Ingresa eL id estadio.");

            Enumeration<String> teamKeys = controlador.estadios.keys();

            while (teamKeys.hasMoreElements()) {
                String teamKey = teamKeys.nextElement();
                System.out.println("Key: " + teamKey + " Nombre del estadio: " +
                        controlador.estadios.get(teamKey).getNombre());
            }
            String idEstadio = sc.nextLine();
            estadio estadio = new estadio();
            while (!controlador.estadios.containsKey(idEstadio)) {
                System.out.println("Opcion no valida seleccione un estadio existente para continuar ");
                idEstadio = sc.nextLine();
            }
            estadio = controlador.estadios.get(idEstadio);
            equipo.setId(id);
            equipo.setNombre(nombre);
            equipo.setCiudad(ciudad);
            equipo.setEstadio(estadio);
            controlador.equipos.put(id, equipo);
        } else {
            System.out.println("El equipo seleccionado no existe");
            System.out.println("Presione enter para continuar");
            sc.nextLine();
            EditarEquipo(sc);
        }

    }

    public static void EliminarEquipo(Scanner sc) {
        Enumeration<String> teamKeyse = controlador.equipos.keys();
        while (teamKeyse.hasMoreElements()) {
            String teamKeye = teamKeyse.nextElement();
            System.out.println("Key: " + teamKeye + " Nombre del equipo: " +
                    controlador.equipos.get(teamKeye).getNombre() + " Ubicacion: " +
                    controlador.equipos.get(teamKeye).getCiudad() + " estadio: " +
                    controlador.equipos.get(teamKeye).getEstadio().getNombre());
        }
        System.out.println("Ingrese codigo del equipo a eliminar: ");
        String codigoEl = sc.nextLine();
        while (!controlador.equipos.containsKey(codigoEl)) {
            System.out.println("Opcion no valida seleccione un equipo existente para continuar ");
            codigoEl = sc.nextLine();
        }
        Team ee = controlador.equipos.remove(codigoEl);
        if (ee != null) {
            System.out.println("El equipo eliminado fue " + ee.getNombre());
        } else {
            System.out.println("equipo no encontrado.");
        }

    }

    public void ListarEquipos(Scanner sc) {

        Enumeration<String> teamKeys = controlador.equipos.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                    controlador.equipos.get(teamKey).getNombre());
        }

    }

}
