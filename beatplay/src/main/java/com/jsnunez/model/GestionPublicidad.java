package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionPublicidad {
    
    public static Controller controlador;

    public static void CrearPatrocinador(Scanner sc) {

        Publicidad publicidad = new Publicidad();
        ListarPatrocinador();
        System.out.println("Ingresa el ID de la publicidad");
        String id = sc.nextLine();
        if (controlador.patrocinadores.containsKey(id)) {
            System.out.println("El código de la publicidad ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese el nombre del Patrocinador");
            String nombre = sc.nextLine();

            System.out.println("tipo.");
            String tipo = sc.nextLine();

            System.out.println("monto.");
            int monto = sc.nextInt();
            sc.nextLine();

            System.out.println("duracion.");
            String duracion = sc.nextLine();
         
            publicidad.setId(id);
            publicidad.setNombre(nombre);
            publicidad.setTipo(tipo);
            publicidad.setMonto(monto);

            publicidad.setDuracion(duracion);


            controlador.publicidad.put(id, publicidad);

        }

    }

    public static void EditarPatrocinador(Scanner sc) {
        ListarPatrocinador();

        Patrocinador patrocinadores = new Patrocinador();
        System.out.println("Ingrese el ID del patrocinadores a editar.");
        String id = sc.nextLine();
        while (!controlador.patrocinadores.containsKey(id) | id == "salir") {
            System.out
                    .println("Opcion no valida seleccione un patrocinadores existente para continuar o escriba salir");
            id = sc.nextLine();
            if (id.equals("salir")) {
                break;
            }
        }
        if (id.equals("salir")) {
        } else {
            System.out.println("Ingrese el nombre del Patrocinador");
            String nombre = sc.nextLine();

            System.out.println("tipo.");
            String tipo = sc.nextLine();

            System.out.println("monto.");
            int monto = sc.nextInt();
            sc.nextLine();

            System.out.println("fechainicio.");
            String fechainicio = sc.nextLine();
            System.out.println("fechafin.");
            String fechafin = sc.nextLine();
            patrocinadores.setId(id);
            patrocinadores.setNombre(nombre);
            patrocinadores.setTipo(tipo);
            patrocinadores.setMonto(monto);

            patrocinadores.setFechaInicio(fechainicio);

            patrocinadores.setFechaFin(fechafin);

            controlador.patrocinadores.put(id, patrocinadores);

        }
    }

    public static void EliminarPatrocinador(Scanner sc) {
        ListarPatrocinador();
        System.out.println("Ingrese el codigo del Patrocinador a ELIMINAR: ");
        String codigoJ1 = sc.nextLine();
        Patrocinador je = controlador.patrocinadores.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getNombre() + " ah sido ELIMINADO correctamente.");
        } else {
            System.out.println("Patrocinador no encontrado");
        }
    }

    public static void ListarPatrocinador() {

        Enumeration<String> playerKeys = controlador.patrocinadores.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("ID: " + playerKey + " Nombre del patrocineo: " +
                    controlador.patrocinadores.get(playerKey).getNombre());
        }

    }
}
