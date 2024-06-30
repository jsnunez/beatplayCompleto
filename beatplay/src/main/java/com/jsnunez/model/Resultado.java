package com.jsnunez.model;

public class Resultado {
    String id;
    Partido partido;
    int golesEquipoLocal;
    int golesEquipoVisitante;
    public Resultado() {
    }
    public Resultado(String id, Partido partido, int golesEquipoLocal, int golesEquipoVisitante) {
        this.id = id;
        this.partido = partido;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }


    
}
