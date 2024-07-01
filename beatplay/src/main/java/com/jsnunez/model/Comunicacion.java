package com.jsnunez.model;

import java.util.ArrayList;
import java.util.List;

public class Comunicacion {
    String id;
    String titulo;
    String contenido;
    String fechaPublicacion;
    List<Usuario> destinatarios;
    public Comunicacion() {
        fechaPublicacion="no tiene asignada";
        destinatarios = new ArrayList<Usuario>();
    }
    public Comunicacion(String id, String titulo, String contenido, String fechaPublicacion,
            List<Usuario> destinatarios) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.destinatarios = destinatarios;
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
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public List<Usuario> getDestinatarios() {
        return destinatarios;
    }
    public void setDestinatarios(Usuario destinatarios) {
        this.destinatarios.add(destinatarios);
    }

    
}
