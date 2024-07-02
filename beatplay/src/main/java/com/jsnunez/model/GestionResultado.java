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

        GestionPartido.ListarPartidos();

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
        int goles = 0;
        while (golesEquipoLocal > goles) {
            goles++;
            System.out.println("Ingrese id del gol");
            String idGol = sc.nextLine();
            Team equipolocal = partidosel.getEquipoLocal();
            System.out.println(equipolocal);
            for (Player n : equipolocal.getListJugadores()) {

                System.out.println("ID" + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            Gol gol = new Gol(idpartido, null, equipolocal, idjugador, partidosel);
            controlador.goles.put(idGol, gol);
        }

        System.out.println("Ingrese goles del equipo visitante");
        int golesEquipoVisitante = sc.nextInt();
        sc.nextLine();
        while (golesEquipoVisitante > goles) {
            goles++;
            System.out.println("Ingrese id del gol");
            String idGol = sc.nextLine();
            Team equipolocal = partidosel.getEquipoLocal();
            System.out.println(equipolocal);
            for (Player n : equipolocal.getListJugadores()) {

                System.out.println("ID" + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            Gol gol = new Gol(idpartido, null, equipolocal, idjugador, partidosel);
            controlador.goles.put(idGol, gol);
        }

        
        System.out.println("Ingrese # tarjetas");
        int numtarjetas = sc.nextInt();
        sc.nextLine();
       int contarjetas=0;
        while (numtarjetas > contarjetas) {
            contarjetas++;
            System.out.println("Ingrese id del tarjeta");
            String idTarjeta = sc.nextLine();
            System.out.println("Ingrese id del jugador");
            String idJugador = sc.nextLine();
          
            System.out.println("Tipo");
            String tipo = sc.nextLine();
            System.out.println("Minuto");
            String minuto = sc.nextLine();
           Tarjeta tarjeta = new Tarjeta(idpartido, controlador.jugadores.get(idJugador), partidosel, tipo, minuto);
            controlador.tarjetas.put(idTarjeta, tarjeta);
        }

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
