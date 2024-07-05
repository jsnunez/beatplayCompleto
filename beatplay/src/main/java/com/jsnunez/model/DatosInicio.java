package com.jsnunez.model;

import bet.Controller;

public class DatosInicio {

    public static Controller controlador;

    public static void start() {
        // Permisos y Roles
        Permiso permiso = new Permiso("001", "Editar");
        Rol rol = new Rol("001", "Administrador", permiso);
        Rol rol1 = new Rol("002", "Aficionado", permiso);
        controlador.roles.put("002", rol1);

        Rol rol2 = new Rol("003", "Periodista", permiso);
        controlador.roles.put("003", rol2);

        Rol rol3 = new Rol("004", "Equipo Técnico", permiso);
        controlador.roles.put("004", rol3);

        Rol rol4 = new Rol("005", "Árbitro", permiso);
        controlador.roles.put("005", rol4);

        Rol rol5 = new Rol("006", "Médico del Equipo", permiso);
        controlador.roles.put("006", rol5);

        // Usuarios
        Usuario usuario11 = new Usuario("001", "", "jsnunez@gmail.com", "", rol);
        controlador.usuarios.put("011", usuario11);
        Usuario usuario = new Usuario("002", "joan", "jsnunez94@gmail.com", "123456", rol);
        controlador.usuarios.put("002", usuario);
        Usuario usuario1 = new Usuario("003", "ana", "ana@example.com", "123", rol1);
        controlador.usuarios.put("003", usuario1);


        Usuario usuario2 = new Usuario("004", "luis", "luis@example.com", "123", rol2);
        controlador.usuarios.put("004", usuario2);

        Usuario usuario3 = new Usuario("005", "maria", "maria@example.com", "123", rol3);
        controlador.usuarios.put("005", usuario3);

        Usuario usuario4 = new Usuario("006", "carlos", "carlos@example.com", "123", rol4);
        controlador.usuarios.put("006", usuario4);

        Usuario usuario5 = new Usuario("007", "elena", "elena@example.com", "123", rol5);

        controlador.usuarios.put("007", usuario5);

        // estadios
        estadio estadio = new estadio("001", "El Campín", "Bogotá", 1000000);
        controlador.estadios.put("001", estadio);
        estadio estadio1 = new estadio("002", "Atanasio Girardot", "Medellín", 50000);
        controlador.estadios.put("002", estadio1);
        estadio estadio2 = new estadio("003", "Metropolitano", "Barranquilla", 60000);
        controlador.estadios.put("003", estadio2);
        estadio estadio3 = new estadio("004", "Nemesio Camacho", "Bogotá", 40000);
        controlador.estadios.put("004", estadio3);
        estadio estadio4 = new estadio("005", "Pascual Guerrero", "Cali", 35000);
        controlador.estadios.put("005", estadio4);
        estadio estadio5 = new estadio("006", "Palmaseca", "Palmira", 45000);
        controlador.estadios.put("006", estadio5);

        // Equipos
        Team equipo1 = new Team("001", "Bucaramanga", "Bucaramanga", estadio);
        controlador.equipos.put("001", equipo1);
        Team equipo2 = new Team("002", "Nacional", "Medellín", estadio5);
        controlador.equipos.put("002", equipo2);
        Team equipo3 = new Team("003", "Millonarios", "Bogotá", estadio);
        controlador.equipos.put("003", equipo3);
        Team equipo4 = new Team("004", "América", "Cali", estadio1);
        controlador.equipos.put("004", equipo4);
        Team equipo5 = new Team("005", "Once Caldas", "Manizales", estadio3);
        controlador.equipos.put("005", equipo5);
        Team equipo6 = new Team("006", "Deportivo Cali", "Cali", estadio2);
        controlador.equipos.put("006", equipo6);
        Team equipo7 = new Team("007", "Santa Fe", "Bogotá", estadio4);
        controlador.equipos.put("007", equipo7);
        Team equipo8 = new Team("008", "Tolima", "Ibagué", estadio3);
        controlador.equipos.put("008", equipo8);
        Team equipo9 = new Team("009", "Pasto", "Pasto", estadio4);
        controlador.equipos.put("009", equipo9);
        Team equipo10 = new Team("010", "Envigado", "Envigado", estadio5);
        controlador.equipos.put("010", equipo10);

        // Partidos
        Partido partido = new Partido("001", equipo2, equipo10, "12/06/24", "11:00am", estadio);
        controlador.partidos.put("001", partido);
        Partido partido1 = new Partido("002", equipo3, equipo4, "13/06/24", "2:00pm", estadio1);
        controlador.partidos.put("002", partido1);
        Partido partido2 = new Partido("003", equipo5, equipo6, "14/06/24", "4:00pm", estadio2);
        controlador.partidos.put("003", partido2);
        Partido partido3 = new Partido("004", equipo7, equipo8, "15/06/24", "6:00pm", estadio3);
        controlador.partidos.put("004", partido3);
        Partido partido4 = new Partido("005", equipo9, equipo1, "16/06/24", "8:00pm", estadio4);
        controlador.partidos.put("005", partido4);
        Partido partido5 = new Partido("006", equipo2, equipo3, "17/06/24", "10:00am", estadio5);
        controlador.partidos.put("006", partido5);
        Partido partido6 = new Partido("007", equipo1, equipo2, "17/06/24", "10:00am", estadio5);
        controlador.partidos.put("007", partido6);
        // Jugadores para cada equipo
        // Equipo 1
        Player jugador1 = new Player("001", "Brandon", "Camargo", 30, "colombiano", "medio", 10, equipo1, null, null);
        controlador.jugadores.put("001", jugador1);

        Player jugador2 = new Player("002", "Sebastian", "Nunez", 29, "colombiano", "delantero", 9, equipo1, null, null);
        controlador.jugadores.put("002", jugador2);
        // ... añadir los otros 13 jugadores para equipo1
        equipo1.setListJugadores(jugador1);
equipo1.setListJugadores(jugador2);

controlador.equipos.put("001", equipo1);

        // Equipo 2
        Player jugador16 = new Player("016", "Carlos", "Lopez", 25, "colombiano", "defensa", 5, equipo2, null, null);
        controlador.jugadores.put("016", jugador16);
        Player jugador17 = new Player("017", "Camilo", "Martinez", 24, "colombiano", "portero", 1, equipo2, null, null);
        controlador.jugadores.put("017", jugador17);
        // ... añadir los otros 13 jugadores para equipo2
        equipo2.setListJugadores(jugador16);
equipo2.setListJugadores(jugador17);

controlador.equipos.put("002", equipo2);
        // Equipo 3
        Player jugador31 = new Player("031", "Fabian", "Gomez", 26, "colombiano", "medio", 8, equipo3, null, null);
        controlador.jugadores.put("031", jugador31);
        Player jugador32 = new Player("032", "Daniel", "Perez", 23, "colombiano", "delantero", 11, equipo3, null, null);
        controlador.jugadores.put("032", jugador32);
        // ... añadir los otros 13 jugadores para equipo3

        // Equipo 4
        Player jugador46 = new Player("046", "Andres", "Sanchez", 28, "colombiano", "defensa", 6, equipo4, null, null);
        controlador.jugadores.put("046", jugador46);
        Player jugador47 = new Player("047", "Juan", "Diaz", 27, "colombiano", "portero", 1, equipo4, null, null);
        controlador.jugadores.put("047", jugador47);
        // ... añadir los otros 13 jugadores para equipo4

        // Equipo 5
        Player jugador61 = new Player("061", "Mateo", "Ramirez", 30, "colombiano", "medio", 10, equipo5, null, null);
        controlador.jugadores.put("061", jugador61);
        Player jugador62 = new Player("062", "Jorge", "Torres", 29, "colombiano", "delantero", 9, equipo5, null, null);
        controlador.jugadores.put("062", jugador62);
        // ... añadir los otros 13 jugadores para equipo5

        // Equipo 6
        Player jugador76 = new Player("076", "Julian", "Castro", 25, "colombiano", "defensa", 5, equipo6, null, null);
        controlador.jugadores.put("076", jugador76);
        Player jugador77 = new Player("077", "Oscar", "Moreno", 24, "colombiano", "portero", 1, equipo6, null, null);
        controlador.jugadores.put("077", jugador77);
        // ... añadir los otros 13 jugadores para equipo6

        // Equipo 7
        Player jugador91 = new Player("091", "Luis", "Hernandez", 26, "colombiano", "medio", 8, equipo7, null, null);
        controlador.jugadores.put("091", jugador91);
        Player jugador92 = new Player("092", "Jose", "Vargas", 23, "colombiano", "delantero", 11, equipo7, null, null);
        controlador.jugadores.put("092", jugador92);
        // ... añadir los otros 13 jugadores para equipo7

        // Equipo 8
        Player jugador106 = new Player("106", "Miguel", "Rojas", 28, "colombiano", "defensa", 6, equipo8, null, null);
        controlador.jugadores.put("106", jugador106);
        Player jugador107 = new Player("107", "Carlos", "Lopez", 27, "colombiano", "portero", 1, equipo8, null, null);
        controlador.jugadores.put("107", jugador107);
        // ... añadir los otros 13 jugadores para equipo8

        // Equipo 9
        Player jugador121 = new Player("121", "Camilo", "Martinez", 30, "colombiano", "medio", 10, equipo9, null, null);
        controlador.jugadores.put("121", jugador121);
        Player jugador122 = new Player("122", "Daniel", "Perez", 29, "colombiano", "delantero", 9, equipo9, null, null);
        controlador.jugadores.put("122", jugador122);
        // ... añadir los otros 13 jugadores para equipo9

        // Equipo 10
        Player jugador136 = new Player("136", "Fabian", "Gomez", 25, "colombiano", "defensa", 5, equipo10, null, null);
        controlador.jugadores.put("136", jugador136);
        Player jugador137 = new Player("137", "Andres", "Sanchez", 24, "colombiano", "portero", 1, equipo10, null, null);
        controlador.jugadores.put("137", jugador137);
        // ... añadir los otros 13 jugadores para equipo10

    }
}
