package com.jsnunez.model;

import java.util.List;

public class Partido {
    String id;
    Team equipoLocal;
    Team equipoVisitante;
    String fecha;
    String hora;
    estadio estadio;
    List<Gol> goles;
    List<Tarjeta> tarjetas;
    List<Incidente> incidentes;
    Resultado resultado;

}
