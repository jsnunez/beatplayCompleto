package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionResultado {

    public static Controller controlador;

    public static void CrearResultado(Scanner sc) {

        Resultado resultado = new Resultado();


       
        System.out.println(" Ingrese ID del resultado");
        String id = sc.nextLine();
        
        Enumeration<String> playerKeys = controlador.partidos.keys();
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Equipo local: " + controlador.partidos.get(playerKey).getEquipoLocal().getNombre() +
                    " Equipo visitante: " + controlador.partidos.get(playerKey).getEquipoVisitante().getNombre() +
                    " Fecha: " + controlador.partidos.get(playerKey).getFecha() +
                    " Estadio: " + controlador.partidos.get(playerKey).getEstadio().getNombre());
        }

        System.out.println("Selecione el ID del partido ");
        String idpartido = sc.nextLine();
        while (!controlador.partidos.containsKey(idpartido) | id == "salir") {
            System.out.println("Opcion no valida seleccione un id existente o escriba salir para continuar ");
            id = sc.nextLine();
            if (id.equals("salir")) {
                break;
            }
        }

        Partido partidosel = new Partido();
        partidosel = controlador.partidos.get(idpartido);
        System.out.println("Ingrese goles del equipo local");
        int golesEquipoLocal = sc.nextInt();
        sc.nextLine();
        // for (int i = 0; i < golesEquipoLocal; i++) {
        // System.out.println(" Ingrese ID del gol");
        // String idGol = sc.nextLine();
        // System.out.println(" Ingrese ID del jugador");
        // String idjugador = sc.nextLine();

        // }
        System.out.println("Ingrese goles del equipo local");
        int golesEquipoVisitante = sc.nextInt();
        sc.nextLine();

        resultado.setId(idpartido);
        resultado.setGolesEquipoLocal(golesEquipoLocal);
        resultado.setGolesEquipoVisitante(golesEquipoVisitante);
        resultado.setPartido(partidosel);
        controlador.Resultados.put(id, resultado);
    }

    public static void EditarResultado(Scanner sc) {

        Resultado resultado = new Resultado();
        Enumeration<String> playerKeys = controlador.Resultados.keys();
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey + " Goles equipo local "
                    + controlador.Resultados.get(playerKey).getGolesEquipoLocal() +
                    " Goles equipo visitante " + controlador.Resultados.get(playerKey).getGolesEquipoVisitante());
        }
        System.out.println("seleccione ID del Resultado a editar");
        String id = sc.nextLine();
        if (controlador.Resultados.containsKey(id)) {
            resultado = controlador.Resultados.get(id);
      
           
            System.out.println("Ingrese goles del equipo local");
            int golesEquipoLocal = sc.nextInt();
            sc.nextLine();
            // for (int i = 0; i < golesEquipoLocal; i++) {
            // System.out.println(" Ingrese ID del gol");
            // String idGol = sc.nextLine();
            // System.out.println(" Ingrese ID del jugador");
            // String idjugador = sc.nextLine();
    
            // }
            System.out.println("Ingrese goles del equipo local");
            int golesEquipoVisitante = sc.nextInt();
            sc.nextLine();
    
           
            resultado.setGolesEquipoLocal(golesEquipoLocal);
            resultado.setGolesEquipoVisitante(golesEquipoVisitante);
        
            controlador.Resultados.put(id, resultado);
        }
        
        }
      
  

    public static void ListarResultado() {

        Enumeration<String> playerKeys = controlador.Resultados.keys();
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey + " Goles equipo local "
                    + controlador.Resultados.get(playerKey).getGolesEquipoLocal() +
                    " Goles equipo visitante " + controlador.Resultados.get(playerKey).getGolesEquipoVisitante());
        }
       
    }

}
