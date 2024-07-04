package com.jsnunez.model;

import java.util.ArrayList;
import java.util.List;

public class MedioDeComunicacion {

String id;
String nombre;
String TipoMedio;
List<Usuario> listPeriodistas;
public MedioDeComunicacion() {
    
    listPeriodistas = new ArrayList<Usuario>();
}
public MedioDeComunicacion(String id, String nombre, String tipoMedio, List<Usuario> listPeriodistas) {
    this.id = id;
    this.nombre = nombre;
    TipoMedio = tipoMedio;
    
    listPeriodistas = new ArrayList<Usuario>();
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
public String getTipoMedio() {
    return TipoMedio;
}
public void setTipoMedio(String tipoMedio) {
    TipoMedio = tipoMedio;
}
public List<Usuario> getListPeriodistas() {
    return listPeriodistas;
}
public void setListPeriodistas(Usuario usuario) {
    this.listPeriodistas.add(usuario);
}
public void modiListPeriodistas(List<Usuario> listPeriodistas2) {
    this.listPeriodistas=listPeriodistas2;
}


}
