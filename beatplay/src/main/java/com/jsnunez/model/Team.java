package com.jsnunez.model;

import java.util.List;

public class Team {
    String id;
    String nombre;
    String ciudad;
    estadio estadio;
    String entrenador;
    List <Player> listJugadores;
    List <Partido> listPartido;
    public Team() {
    }

    
    public Team(String id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(estadio estadio) {
        this.estadio = estadio;
    }
    public String getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    public List<Player> getListJugadores() {
        return listJugadores;
    }
    public void setListJugadores(Player player) {
        this.listJugadores.add(player);
    }
    public List<Partido> getListPartido() {
        return listPartido;
    }
    public void setListPartido(Partido partido) {
        this.listPartido.add(partido);;
    }

    
}
