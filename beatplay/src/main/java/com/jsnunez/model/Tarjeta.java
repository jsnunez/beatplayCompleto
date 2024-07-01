package com.jsnunez.model;

public class Tarjeta {
    String id;
    Player jugador;
    Partido partido;
    String tipo;
    String minuto;
    public Tarjeta() {
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
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
    
}
