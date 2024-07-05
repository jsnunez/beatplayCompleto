package com.jsnunez.model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
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
            System.out.println("Ingrese id del gol del equipo local");
            String idGol = sc.nextLine();
            List<Player> listJugadores = new ArrayList<Player>();
            listJugadores  = controlador.equipos.get(partidosel.getEquipoLocal().getId()).getListJugadores();
            
            for (Player n : listJugadores) {

                System.out.println("ID  " + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            String minuto ="12";
            Gol gol = new Gol(idGol, controlador.jugadores.get(idjugador), partidosel.getEquipoLocal(), minuto, partidosel);
            
            controlador.goles.put(idGol, gol);
            ListarGoles();
        }

        System.out.println("Ingrese goles del equipo visitante");
        int golesEquipoVisitante = sc.nextInt();
        sc.nextLine();
        goles=0;
        while (golesEquipoVisitante > goles) {
            goles++;
            System.out.println("Ingrese id del gol del equipo visitante");
            String idGol = sc.nextLine();
            List<Player> listJugadores = new ArrayList<Player>();
            listJugadores  = controlador.equipos.get(partidosel.getEquipoVisitante().getId()).getListJugadores();
            
            for (Player n : listJugadores) {

                System.out.println("ID  " + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            String minuto ="12";
            Gol gol = new Gol(idGol, controlador.jugadores.get(idjugador), partidosel.getEquipoVisitante(), minuto, partidosel);
            controlador.goles.put(idGol, gol);
           
        }

        
        System.out.println("Ingrese # tarjetas equipo local");
        int numtarjetas = sc.nextInt();
        sc.nextLine();
       int contarjetas=0;
        while (numtarjetas > contarjetas) {
            contarjetas++;
            System.out.println("Ingrese id del tarjeta del equipo local");
            String idtarjeta = sc.nextLine();
            List<Player> listJugadores = new ArrayList<Player>();
            listJugadores  = controlador.equipos.get(partidosel.getEquipoLocal().getId()).getListJugadores();
            
            for (Player n : listJugadores) {

                System.out.println("ID  " + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            System.out.println("Seleccione tipo de tarjeta");
            System.out.println("1. Roja");
            System.out.println("2. Amarilla");
            int tipoTarjeta = sc.nextInt();
            String tarjetaES;
            if (tipoTarjeta==1) {
                tarjetaES="Roja";
            }
            else{
               tarjetaES="Amarilla";
            }
            sc.nextLine();
            System.out.println("Seleccione minuto");
            String minuto = sc.nextLine();
            Tarjeta tarjeta = new Tarjeta(idtarjeta,controlador.jugadores.get(idjugador), partidosel, tarjetaES, minuto);
            controlador.tarjetas.put(idtarjeta, tarjeta);
        }

          
        System.out.println("Ingrese # tarjetas equipo visitante");
       numtarjetas = sc.nextInt();
        sc.nextLine();
       contarjetas=0;
        while (numtarjetas > contarjetas) {
            contarjetas++;

            System.out.println("Ingrese id del tarjeta del equipo visitante");
            String idtarjeta = sc.nextLine();
            List<Player> listJugadores = new ArrayList<Player>();
            listJugadores  = controlador.equipos.get(partidosel.getEquipoVisitante().getId()).getListJugadores();
            
            for (Player n : listJugadores) {

                System.out.println("ID  " + n.getId() + "Nombre: " + n.getNombre());

            }
            System.out.println("Seleccione Id del jugador");
            String idjugador = sc.nextLine();
            System.out.println("Seleccione tipo de tarjeta");
            System.out.println("1. Roja");
            System.out.println("2. Amarilla");
            int tipoTarjeta = sc.nextInt();
            String tarjetaES;
            if (tipoTarjeta==1) {
                tarjetaES="Roja";
            }
            else{
               tarjetaES="Amarilla";
            }
            sc.nextLine();
            System.out.println("Seleccione minuto");
            String minuto = sc.nextLine();
            Tarjeta tarjeta = new Tarjeta(idtarjeta,controlador.jugadores.get(idjugador), partidosel, tarjetaES, minuto);
            controlador.tarjetas.put(idtarjeta, tarjeta);
            ListarGoles();
        }
        resultado.setId(idpartido);
        resultado.setGolesEquipoLocal(golesEquipoLocal);
        resultado.setGolesEquipoVisitante(golesEquipoVisitante);
        resultado.setPartido(partidosel);
        controlador.Resultados.put(id, resultado);
     
        ListarTarjetas();
    
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

    public static void ListarGoles() {

        Enumeration<String> playerKeys = controlador.goles.keys();
        while (playerKeys.hasMoreElements()) {
          
            String playerKey = playerKeys.nextElement();

            System.out.println("Key: " + playerKey + "  Jugador "
                    + controlador.goles.get(playerKey).getJugador().getNombre()+
                    " equipo " + controlador.goles.get(playerKey).getEquipo().getNombre());
        }

    }

    public static void ListarTarjetas() {

        Enumeration<String> playerKeys = controlador.tarjetas.keys();
        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey + "  Jugador "
                    + controlador.tarjetas.get(playerKey).getJugador().getNombre()+
                    " tipo tarjeta:   " + controlador.tarjetas.get(playerKey).getTipo()+
                    "minuto: "+ controlador.tarjetas.get(playerKey).getMinuto() );
        }

    }

}
