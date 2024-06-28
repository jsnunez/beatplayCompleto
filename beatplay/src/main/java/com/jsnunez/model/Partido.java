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
    public Partido() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Team getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(Team equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public Team getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(Team equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(estadio estadio) {
        this.estadio = estadio;
    }
    public List<Gol> getGoles() {
        return goles;
    }
    public void setGoles(List<Gol> goles) {
        this.goles = goles;
    }
    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }
    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
    public List<Incidente> getIncidentes() {
        return incidentes;
    }
    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

}
