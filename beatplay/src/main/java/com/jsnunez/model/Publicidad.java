package com.jsnunez.model;

public class Publicidad {
    String id;
    String nombre;
    String tipo;
    int monto;
    String duracion;
    public Publicidad(String id, String nombre, String tipo, int monto, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.monto = monto;
        this.duracion = duracion;
    }
    public Publicidad() {
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
