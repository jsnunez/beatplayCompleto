package com.jsnunez.model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import bet.Controller;

public class GestionPartido {
    public static Controller controlador;

    public static void CrearPartido(Scanner sc) {

        Partido partido = new Partido();

        System.out.println("Ingrese id del partido");
        String id = sc.nextLine();
        if (controlador.partidos.containsKey(id)) {
            System.out.println("El código del partido ya existe. Por favor, intente con otro código.");
        } else {
            GestionEquipo.ListarEquipos();
            System.out.println("Ingrese id del equipo local");
            String equipoLocal = sc.nextLine();
            System.out.println(controlador.equipos.get(equipoLocal).getNombre());
            System.out.println("Ingrese id del equipo visitante");
            String equipoVisitante = sc.nextLine();
            System.out.println(controlador.equipos.get(equipoVisitante).getNombre());

            System.out.println("Ingrese fecha del partido");
            String fecha = sc.nextLine();

            System.out.println("Ingrese hora del partido");
            String hora = sc.nextLine();

            System.out.println("Ingrese id estadio del partido");

            String idEstadio = sc.nextLine();

            System.out.println(controlador.estadios.get(idEstadio).getNombre());

            partido.setId(id);
            partido.setEquipoLocal(controlador.equipos.get(equipoLocal));
            partido.setEquipoVisitante(controlador.equipos.get(equipoVisitante));
            partido.setFecha(fecha);
            partido.setHora(hora);
            partido.setEstadio(controlador.estadios.get(idEstadio));

            controlador.partidos.put(id, partido);
Team local =  new Team();
local=controlador.equipos.get(equipoLocal);
Team visitante =  new Team();
visitante=controlador.equipos.get(equipoVisitante);
local.setListPartido(partido);
visitante.setListPartido(partido);
controlador.equipos.put(equipoLocal, local);
controlador.equipos.put(equipoVisitante, visitante);



        }
    }

    public static void EditarPartido(Scanner sc) {
        Partido partido = new Partido();
        Enumeration<String> teamKeys = controlador.partidos.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            System.out.println("Key: " + teamKey + " El equipo visitante es: " +
                    controlador.partidos.get(teamKey).getEquipoLocal().getNombre() + " -----    El equipo local es: " +
                    controlador.partidos.get(teamKey).getEquipoVisitante().getNombre()+ " ------     Estadio donde se va jugar el partido: " +
                    controlador.partidos.get(teamKey).getEquipoVisitante().getEstadio().getNombre());
        }
        System.out.println("Ingrese id del partido a editar");
        String id = sc.nextLine();

        System.out.println("Ingrese id del equipo local");
        String equipoLocal = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoLocal).getNombre());
        System.out.println("Ingrese id del equipo visitante");
        String equipoVisitante = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoVisitante).getNombre());

        System.out.println("Ingrese fecha del partido");
        String fecha = sc.nextLine();

        System.out.println("Ingrese hora del partido");
        String hora = sc.nextLine();

        System.out.println("Ingrese id estadio del partido");

        String idEstadio = sc.nextLine();

        System.out.println(controlador.estadios.get(idEstadio).getNombre());

        partido.setId(id);
        partido.setEquipoLocal(controlador.equipos.get(equipoLocal));
        partido.setEquipoVisitante(controlador.equipos.get(equipoVisitante));
        partido.setFecha(fecha);
        partido.setHora(hora);
        partido.setEstadio(controlador.estadios.get(idEstadio));

        controlador.partidos.put(id, partido);
        Team local =  new Team();
local=controlador.equipos.get(equipoLocal);
Team visitante =  new Team();
visitante=controlador.equipos.get(equipoVisitante);
local.setListPartido(partido);
visitante.setListPartido(partido);
controlador.equipos.put(equipoLocal, local);
controlador.equipos.put(equipoVisitante, visitante);

    }

    public static void EliminarPartido(Scanner sc) {

        ListarPartidos();
        System.out.println("Ingrese el codigo del Partido a ELIMINAR: ");
        String codigoJ1 = sc.nextLine();
        
        Partido jt = controlador.partidos.get(codigoJ1);
        Partido je = controlador.partidos.remove(codigoJ1);
        if (je != null) {
            System.out.println(je.getId() + " ah sido ELIMINADO correctamente.");
            Team equipoLocal = new Team();
            Team equipoVisitante = new Team();
            
            equipoLocal = controlador.equipos.get(jt.getEquipoLocal().getId());
            equipoVisitante = controlador.equipos.get(jt.getEquipoVisitante().getId());

            List<Partido> listPartidoLocal = new ArrayList<Partido>();
            List<Partido> listPartidoVisitante = new ArrayList<Partido>();
            listPartidoLocal=equipoLocal.listPartido;
            listPartidoVisitante=equipoVisitante.listPartido;
            int con =-1;
            int ubicacion=-1;
            int con2 =-1;
            int ubicacion2=-1;
            for (Partido n : listPartidoLocal) {
                con++;
                if (equipoLocal.getId().equals(n.getId())) {
                    ubicacion=con;
                }

            }
            if (ubicacion>=0) {
                System.out.println("jugador en posicion"+ubicacion);
                listPartidoLocal.remove(ubicacion);
                equipoLocal.modiListpartiodos(listPartidoLocal);
                controlador.equipos.put(equipoLocal.getId(), equipoLocal);
            }
            for (Partido n : listPartidoVisitante) {
                con2++;
                if (equipoVisitante.getId().equals(n.getId())) {
                    ubicacion2=con2;
                }

            }
            if (ubicacion2>=0) {
                System.out.println("jugador en posicion"+ubicacion2);
                listPartidoLocal.remove(ubicacion);
                equipoVisitante.modiListpartiodos(listPartidoVisitante);
                controlador.equipos.put(equipoVisitante.getId(), equipoVisitante);
            }

        } else {
            System.out.println("partido no encontrado");
        }



    }

    public static void ListarPartidos() {

        Enumeration<String> playerKeys = controlador.partidos.keys();

        while (playerKeys.hasMoreElements()) {
            String playerKey = playerKeys.nextElement();
            System.out.println("Key: " + playerKey +
                    " Equipo local: " + controlador.partidos.get(playerKey).getEquipoLocal().getNombre() +
                    " Equipo visitante: " + controlador.partidos.get(playerKey).getEquipoVisitante().getNombre() +
                    " Fecha: " + controlador.partidos.get(playerKey).getFecha()+
                    " Estadio: "+ controlador.partidos.get(playerKey).getEstadio().getNombre());
        }

    }
}

