package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionResultado {

    public static Controller controlador;

    public static void CrearResultado(Scanner sc) {

        Resultado resultado = new Resultado();
       

        Enumeration<String> playerKeys = controlador.partidos.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Equipo local: " + controlador.partidos.get(playerKey).getEquipoLocal().getNombre() +
                    " Equipo visitante: " + controlador.partidos.get(playerKey).getEquipoVisitante().getNombre() +
                    " Fecha: " + controlador.partidos.get(playerKey).getFecha() +
                    " Estadio: " + controlador.partidos.get(playerKey).getEstadio().getNombre());
        }

        System.out.println(" Ingrese id del resultado");
        String id = sc.nextLine();
        System.out.println("Selecione el ID del partido ");
        String idpartido = sc.nextLine();

        Partido partidosel = new Partido();
        partidosel = controlador.partidos.get(idpartido);
        System.out.println("Ingrese goles del equipo local");
        int golesEquipoLocal = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese goles del equipo local");
        int golesEquipoVisitante = sc.nextInt();
        ;
        sc.nextLine();
        resultado.setId(idpartido);
        resultado.setGolesEquipoLocal(golesEquipoLocal);
        resultado.setGolesEquipoVisitante(golesEquipoVisitante);
        resultado.setPartido(partidosel);
        controlador.Resultados.put(id, resultado);
    }

    public static int EditarResultado(Scanner sc) {

        System.out.println("Seleccionar partido");

        int opcion = 0;

        return opcion;
    }
    public static void EliminarResultado(Scanner sc) {
        
        Enumeration<String> playerKeys = controlador.Resultados.keys();
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +" ID partido " + controlador.Resultados.get(playerKey).getId()
                   );
        }
        System.out.println("Seleccionar partido");

        String opcion = sc.nextLine();
        Resultado res =controlador.Resultados.remove(opcion);

        System.out.println("Se elimino el resultado del partido"+ res.getId());
    }

}
