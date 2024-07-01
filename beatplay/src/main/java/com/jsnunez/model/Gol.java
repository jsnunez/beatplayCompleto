package com.jsnunez.model;

public class Gol {
    String id;
    Player jugador;
    Team equipo;
    String minuto;
    Partido partido;
    public Gol() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Player getJugador() {
        return jugador;
    }
    public void setJugador(Player jugador) {
        this.jugador = jugador;
    }
    public Team getEquipo() {
        return equipo;
    }
    public void setEquipo(Team equipo) {
        this.equipo = equipo;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
}
