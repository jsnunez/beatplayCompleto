package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class GestionRelaciones {
        
    public static Controller controlador;
public static void CrearRelaciones(Scanner sc) {

        Relaciones relaciones = new Relaciones();
        System.out.println("Ingresa el ID de la publicidad");
        String id = sc.nextLine();
        if (controlador.relaciones.containsKey(id)) {
            System.out.println("El código de la publicidad ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese el titulo");
            String titulo = sc.nextLine();

            System.out.println("contenido.");
            String contenido = sc.nextLine();

            System.out.println("seleccione id destinatario.");
            GestionUsuarios.ListarUsuarios();
            int iddestinatario = sc.nextInt();
            sc.nextLine();
            Usuario destinatario = controlador.usuarios.get(iddestinatario);

            System.out.println("fecha de publicacion.");
            String fecha = sc.nextLine();
         
            relaciones.setId(id);
            relaciones.setTitulo(titulo);
            relaciones.setContenido(contenido);
            relaciones.setDestinatario(destinatario);
            relaciones.setFecha(fecha);

           controlador.relaciones.put(id, relaciones);


            controlador.relaciones.put(id, relaciones);

        }

    }
}
