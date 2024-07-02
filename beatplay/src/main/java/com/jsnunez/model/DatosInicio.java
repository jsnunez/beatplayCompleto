package com.jsnunez.model;

import bet.Controller;

public class DatosInicio {

    public static Controller controlador;

    public static void start() {

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
        Usuario usuario11 = new Usuario("001", "", "jsnunez@gmail.com", "", rol);
        controlador.usuarios.put("011", usuario11);
        Usuario usuario = new Usuario("002", "joan", "jsnunez94@gmail.com", "123456", rol);
        controlador.usuarios.put("002", usuario);
        Usuario usuario1 = new Usuario("003", "ana", "ana@example.com", "password123", rol1);
        controlador.usuarios.put("003", usuario1);

        Usuario usuario2 = new Usuario("004", "luis", "luis@example.com", "password456", rol2);
        controlador.usuarios.put("004", usuario2);

        Usuario usuario3 = new Usuario("005", "maria", "maria@example.com", "password789", rol3);
        controlador.usuarios.put("005", usuario3);

        Usuario usuario4 = new Usuario("006", "carlos", "carlos@example.com", "password012", rol4);
        controlador.usuarios.put("006", usuario4);

        Usuario usuario5 = new Usuario("007", "elena", "elena@example.com", "password345", rol5);
        controlador.usuarios.put("007", usuario5);
       

        estadio estadio = new estadio("001", "el campin", "Bogota", 1000000);
        controlador.estadios.put("001", estadio);
        estadio estadio1 = new estadio("002", "Atanasio Girardot", "Medellin", 50000);
        controlador.estadios.put("002", estadio1);

        estadio estadio2 = new estadio("003", "Metropolitano", "Barranquilla", 60000);
        controlador.estadios.put("003", estadio2);

        estadio estadio3 = new estadio("004", "Nemesio Camacho", "Bogota", 40000);
        controlador.estadios.put("004", estadio3);

        estadio estadio4 = new estadio("005", "Pascual Guerrero", "Cali", 35000);
        controlador.estadios.put("005", estadio4);

        estadio estadio5 = new estadio("006", "Palmaseca", "Palmira", 45000);
        controlador.estadios.put("006", estadio5);

        Team equipo = new Team("001", "Bucaramanga", "Bucaramanga",estadio);

        controlador.equipos.put("001", equipo);

        Team equipo2 = new Team("002", "Nacional", "Medellin",estadio5);

        controlador.equipos.put("002", equipo2);

        Team equipo3 = new Team("003", "Millonarios", "Bogota",estadio);
        controlador.equipos.put("003", equipo3);

        Team equipo4 = new Team("004", "America", "Cali",estadio1);
        controlador.equipos.put("004", equipo4);

        Team equipo5 = new Team("005", "Once Caldas", "Manizales",estadio3);
        controlador.equipos.put("005", equipo5);

        Team equipo6 = new Team("006", "Deportivo Cali", "Cali",estadio2);
        controlador.equipos.put("006", equipo6);

        Team equipo7 = new Team("007", "Santa Fe", "Bogota",estadio4);
        controlador.equipos.put("007", equipo7);

        Team equipo8 = new Team("008", "Tolima", "Ibague",estadio3);
        controlador.equipos.put("008", equipo8);

        Team equipo9 = new Team("009", "Pasto", "Pasto",estadio4);
        controlador.equipos.put("009", equipo9);

        Team equipo10 = new Team("010", "Envigado", "Envigado",estadio5);
        controlador.equipos.put("010", equipo10);


        Partido partido = new Partido("001", equipo2, equipo10, "12/06/24", "11:00am", estadio);
        controlador.partidos.put("001", partido);
        Partido partido1 = new Partido("002", equipo3, equipo4, "13/06/24", "2:00pm", estadio1);
        controlador.partidos.put("002", partido1);

        Partido partido2 = new Partido("003", equipo5, equipo6, "14/06/24", "4:00pm", estadio2);
        controlador.partidos.put("003", partido2);

        Partido partido3 = new Partido("004", equipo7, equipo8, "15/06/24", "6:00pm", estadio3);
        controlador.partidos.put("004", partido3);

        Partido partido4 = new Partido("005", equipo9, equipo, "16/06/24", "8:00pm", estadio4);
        controlador.partidos.put("005", partido4);

        Partido partido5 = new Partido("006", equipo2, equipo3, "17/06/24", "10:00am", estadio5);
        controlador.partidos.put("006", partido5);
    }
}
