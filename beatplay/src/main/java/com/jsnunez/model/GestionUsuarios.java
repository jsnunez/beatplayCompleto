package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionUsuarios {
    public static Controller controlador;

    public static void CrearUsuarios(Scanner sc) {

        Usuario usuario = new Usuario();
        System.out.println("Ingresa nombre del USUARIO: ");
        String id = sc.nextLine();
        usuario.setId(id);
        if (controlador.usuarios.containsKey(id)) {
            System.out.println("El código del Usuario ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            usuario.setNombre(nombre);
            System.out.println("Ingrese edad: ");
            int edad= sc.nextInt();
            usuario.setId(id);
            System.out.println("Email: ");
            String email = sc.nextLine();
            usuario.setEmail(email);
            System.out.println("Password: ");
            String password = sc.nextLine();
            usuario.setPassword(password);
            ListarRoles();
            System.out.println("Seleccione id del rol a asignar:");

            String idRol = sc.nextLine();
            usuario.setRol(controlador.roles.get(idRol));
            controlador.usuarios.put(id, usuario);
           
            // entrenador
            if (usuario.getRol().getId().equals("003")) {
                System.out.println("Ingrese apellido");
                String apellido= sc.nextLine();
                System.out.println("Ingrese nacionalidad");
                String nacionalidad= sc.nextLine();
                Entrenadores entrenador = new Entrenadores(id, nombre, apellido, edad, nacionalidad, idRol);
            controlador.entrenadores.put(id, entrenador);
            }
            // arbitro
            if (usuario.getRol().getId().equals("004")) {
                System.out.println("Ingrese apellido");
                String apellido= sc.nextLine();
                System.out.println("Ingrese nacionalidad");
                String nacionalidad= sc.nextLine();
                Arbitro arbitro = new Arbitro(idRol, nombre, apellido, edad, nacionalidad, idRol);
                controlador.arbitros.put(id, arbitro);
            }
            // periodista
            // if (usuario.getRol().getId().equals("005")) {
            //     System.out.println("Ingrese apellido");
            //     String apellido= sc.nextLine();
            //     System.out.println("Ingrese nacionalidad");
            //     String nacionalidad= sc.nextLine();
            //      arbitro = new Arbitro(idRol, nombre, apellido, edad, nacionalidad, idRol);
            //     controlador.arbitros.put(id, arbitro);

            // }
            // medico
            // if (usuario.getRol().getId().equals("005")) {

            // }

        }

    }

    public static void EditarArbitro(Scanner sc) {
        ListarArbitros();

        Arbitro arbitro = new Arbitro();
        System.out.println("Ingrese el ID del arbitro a editar.");
        String id = sc.nextLine();
        while (!controlador.jugadores.containsKey(id) | id == "salir") {
            System.out.println("Opcion no valida seleccione un jugador existente para continuar o escriba salir");
            id = sc.nextLine();
            if (id.equals("salir")) {
                break;
            }
        }
        if (id.equals("salir")) {
        } else {
            System.out.println("Ingrese el nombre del Arbitro");
            String nombre = sc.nextLine();
            // System.out.println("Apellido");
            // String apellido = sc.nextLine();
            System.out.println("Edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("experiencia.");
            String experiencia = sc.nextLine();

            sc.nextLine();
            arbitro.setId(id);
            arbitro.setNombre(nombre);
            arbitro.setEdad(edad);

            arbitro.setExperiencia(experiencia);
            controlador.arbitros.put(id, arbitro);

        }
    }

    public static void EliminarArbitro(Scanner sc) {
        ListarArbitros();
        System.out.println("Ingrese el codigo del Arbitro a ELIMINAR: ");
        String codigoJ1 = sc.nextLine();
        Arbitro je = controlador.arbitros.remove(codigoJ1);
        controlador.usuarios.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getNombre() + " ah sido ELIMINADO correctamente.");
        } else {
            System.out.println("Arbitro no encontrado");
        }
    }

    public static void ListarRoles() {
    Enumeration<String> playerKeys = controlador.roles.keys();

    while (playerKeys.hasMoreElements()) {
        String playerKey = playerKeys.nextElement();
        System.out.println("ID: " + playerKey + " Rol : " +
                controlador.roles.get(playerKey).getNombre());
    }}
    public static void ListarArbitros() {

        Enumeration<String> playerKeys = controlador.arbitros.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey + " Nombre del arbitro: " +
                    controlador.arbitros.get(playerKey).getNombre());
        }

    }
    public static void ListarUsuarios() {
        Enumeration<String> playerKeys = controlador.usuarios.keys();
    
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("ID: " + playerKey + " Nombre : " +
                    controlador.usuarios.get(playerKey).getNombre()+
                    "Rol"+controlador.usuarios.get(playerKey).getRol().getNombre());
        }}
}
