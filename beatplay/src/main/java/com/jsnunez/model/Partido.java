package com.jsnunez.model;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    String id;
    Team equipoLocal;
    Team equipoVisitante;
    String fecha;
    String hora;
    estadio estadio;
    List<Gol> goles;
    List<Tarjeta> lstTarjetas;
    List<Incidente> lstIncidentes;
    Resultado resultado;
    public Partido() {

        lstTarjetas = new ArrayList<Tarjeta>();    
        lstIncidentes = new ArrayList<Incidente>();

    }
    public String getId() {
        return id;
    }

    
    public Partido(String id, Team equipoLocal, Team equipoVisitante, String fecha, String hora,
            com.jsnunez.model.estadio estadio) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
        
        lstTarjetas = new ArrayList<Tarjeta>();    
        lstIncidentes = new ArrayList<Incidente>();

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
        return lstTarjetas;
    }
    public void setTarjetas(Tarjeta tarjetas) {
        this.lstTarjetas.add(tarjetas);
    }
    public List<Incidente> getIncidentes() {
        return lstIncidentes;
    }
    public void setIncidentes(Incidente incidentes) {
        this.lstIncidentes.add(incidentes);
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

}
