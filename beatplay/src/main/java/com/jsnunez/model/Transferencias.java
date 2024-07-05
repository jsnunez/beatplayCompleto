package com.jsnunez.model;

public class Transferencias {
    String id;
    Player jugador;
    Team equipoOrigen;
    Team equipoDestino;
    int monto;
    String fecha;
    public Transferencias(String id, Player jugador, Team equipoOrigen, Team equipoDestino, int monto, String fecha) {
        this.id = id;
        this.jugador = jugador;
        this.equipoOrigen = equipoOrigen;
        this.equipoDestino = equipoDestino;
        this.monto = monto;
        this.fecha = fecha;
    }
    public Transferencias() {
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
    public Team getEquipoOrigen() {
        return equipoOrigen;
    }
    public void setEquipoOrigen(Team equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }
    public Team getEquipoDestino() {
        return equipoDestino;
    }
    public void setEquipoDestino(Team equipoDestino) {
        this.equipoDestino = equipoDestino;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

}
