package com.jsnunez.model;

import bet.Controller;

public class DatosInicio {

    public static Controller controlador;

    public static void start() {

        Team equipo = new Team("001", "Bucaramanga", "Bucaramanga");
        
        controlador.equipos.put("001", equipo);

        Team equipo2 = new Team("002", "Nacional", "Medellin");

        controlador.equipos.put("002", equipo2);

        Team equipo3 = new Team("003", "Millonarios", "Bogota");
        controlador.equipos.put("003", equipo3);

        Team equipo4 = new Team("004", "America", "Cali");
        controlador.equipos.put("004", equipo4);

        Team equipo5 = new Team("005", "Once Caldas", "Manizales");
        controlador.equipos.put("005", equipo5);

        Team equipo6 = new Team("006", "Deportivo Cali", "Cali");
        controlador.equipos.put("006", equipo6);

        Team equipo7 = new Team("007", "Santa Fe", "Bogota");
        controlador.equipos.put("007", equipo7);

        Team equipo8 = new Team("008", "Tolima", "Ibague");
        controlador.equipos.put("008", equipo8);

        Team equipo9 = new Team("009", "Pasto", "Pasto");
        controlador.equipos.put("009", equipo9);

        Team equipo10 = new Team("010", "Envigado", "Envigado");
        controlador.equipos.put("010", equipo10);


        estadio estadio =new estadio("001", "el campin", "Bogota", 1000000);
        controlador.estadios.put("001",estadio);
    }
}
