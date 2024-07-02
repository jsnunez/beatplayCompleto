package com.jsnunez.model;

public class Incidente {
    String id;
    Partido partido;
    String descripcion;
    String minuto;
    public Incidente() {
    }
    public Incidente(String id, Partido partido, String descripcion, String minuto) {
        this.id = id;
        this.partido = partido;
        this.descripcion = descripcion;
        this.minuto = minuto;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    
}
