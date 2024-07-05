package com.jsnunez.model;

public class Equipamiento {
String id;
String tipo;
int cantidad;
Team equipoasociado;
String fechaAdquisicion;
public Equipamiento() {
}
public Equipamiento(String id, String tipo, int cantidad, Team equipoasociado, String fechaAdquisicion) {
    this.id = id;
    this.tipo = tipo;
    this.cantidad = cantidad;
    this.equipoasociado = equipoasociado;
    this.fechaAdquisicion = fechaAdquisicion;
}
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public int getCantidad() {
    return cantidad;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}
public Team getEquipoasociado() {
    return equipoasociado;
}
public void setEquipoasociado(Team equipoasociado) {
    this.equipoasociado = equipoasociado;
}
public String getFechaAdquisicion() {
    return fechaAdquisicion;
}
public void setFechaAdquisicion(String fechaAdquisicion) {
    this.fechaAdquisicion = fechaAdquisicion;
}



}
