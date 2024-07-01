package com.jsnunez.model;

import java.io.NotActiveException;
import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionNoticias {

    public static Controller controlador;

    public void EliminarNoticia(Scanner sc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarNoticia'");
    }

    public void EditarNoticia(Scanner sc) {

        VerNoticia();

    }

    public void PublicarNoticia(Scanner sc) {

        Comunicacion comunicacion = new Comunicacion();
        Enumeration<String> playerKeys = controlador.comunicaciones.keys();

        VerNoticia();
        System.out.println("Selecionar id del comunicado a publicar");
        String idComunicado = sc.nextLine();
        if (controlador.comunicaciones.containsKey(idComunicado)) {
            comunicacion = controlador.comunicaciones.get(idComunicado);
            System.out.println("Ingrese fecha publicacion");
            String fechaPublicacion = sc.nextLine();
            comunicacion.setFechaPublicacion(fechaPublicacion);
            controlador.comunicaciones.put(idComunicado, comunicacion);
        } else {
            System.out.println("seleccione una id existente");
            PublicarNoticia(sc);
        }
    }

    public void VerNoticia() {
        Enumeration<String> playerKeys = controlador.comunicaciones.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Titulo: " + controlador.comunicaciones.get(playerKey).getTitulo() +
                    " Contenido: " + controlador.comunicaciones.get(playerKey).getContenido());
            System.out.println("+--------Destinatarios-------------+");
            for (Usuario n : controlador.comunicaciones.get(playerKey).getDestinatarios()) {

                System.out.println("Nombre: " + n.getNombre());

            }
            System.out.println("Fechapublicacion: " + controlador.comunicaciones.get(playerKey).getFechaPublicacion());

        }
    }

    public void CrearNoticia(Scanner sc) {

        Comunicacion comunicacion = new Comunicacion();
        System.out.println(" Ingrese ID del comunicado");
        String id = sc.nextLine();
        System.out.println("escriba el titulo del comunicado ");
        String titulo = sc.nextLine();
        System.out.println("escriba el contenido ");
        String contenido = sc.nextLine();
        System.out.println("Selecione el id del del destinatario del comunicado ");
        comunicacion.setId(id);
        comunicacion.setTitulo(titulo);
        comunicacion.setContenido(contenido);
        Enumeration<String> playerKeys = controlador.usuarios.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Nombre: " + controlador.usuarios.get(playerKey).getNombre() +
                    " Email: " + controlador.usuarios.get(playerKey).getEmail());
        }
        boolean masUser = true;
        while (masUser) {
            System.out.println("Ingrese id del destinatario");
            String idUsuario = sc.nextLine();
            if (controlador.usuarios.containsKey(idUsuario)) {
                Usuario usuario = controlador.usuarios.get(idUsuario);
                comunicacion.setDestinatarios(usuario);
            } else {
                System.out.println("La id seleccionada no existe");
                continue;
            }

            System.out.println("1. agregar otro usuario");
            System.out.println("2. continuar");

            if (sc.nextLine().equals("2")) {
                break;
            }

        }
        controlador.comunicaciones.put(id, comunicacion);

    }

}
