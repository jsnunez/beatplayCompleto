package com.jsnunez.model;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    String id;
    String nombre;
    List<Permiso> lstPermisos;
    
    public Rol(List<Permiso> permisos) {
        this.lstPermisos = permisos;
    }
   public Rol() {
    lstPermisos =new ArrayList<Permiso>();
}
 public Rol(String id, String nombre, Permiso permisos) {
        this.id = id;
        this.nombre = nombre;
        lstPermisos =new ArrayList<Permiso>();
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
    public List<Permiso> getPermisos() {
        return lstPermisos;
    }
    public void setPermisos(Permiso permisos) {
        this.lstPermisos.add(permisos);
    }
}
