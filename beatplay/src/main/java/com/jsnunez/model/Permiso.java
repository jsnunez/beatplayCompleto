package com.jsnunez.model;

public class Permiso {
    String id;
    String descripcion;
    public Permiso(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
