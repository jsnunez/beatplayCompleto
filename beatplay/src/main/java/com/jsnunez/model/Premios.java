package com.jsnunez.model;

public class Premios {
String id;
String nombre;
String descipcion;
String criterio;
String destinatario;
String fecha;
public Premios() {
}
public Premios(String id, String nombre, String descipcion, String criterio, String destinatario, String fecha) {
    this.id = id;
    this.nombre = nombre;
    this.descipcion = descipcion;
    this.criterio = criterio;
    this.destinatario = destinatario;
    this.fecha = fecha;
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
public String getDescipcion() {
    return descipcion;
}
public void setDescipcion(String descipcion) {
    this.descipcion = descipcion;
}
public String getCriterio() {
    return criterio;
}
public void setCriterio(String criterio) {
    this.criterio = criterio;
}
public String getDestinatario() {
    return destinatario;
}
public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
}
public String getFecha() {
    return fecha;
}
public void setFecha(String fecha) {
    this.fecha = fecha;
}



}
