package com.jsnunez.model;

public class Relaciones {
    String id;
    String titulo;
    String contenido;
    Usuario destinatario;
    String fecha;
    public Relaciones() {
    }
    public Relaciones(String id, String titulo, String contenido, Usuario destinatario, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.destinatario = destinatario;
        this.fecha = fecha;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Usuario getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
