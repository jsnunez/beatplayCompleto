package com.jsnunez.model;

public class Arbitro extends Personas {
String experiencia;

public Arbitro() {
   
}
public Arbitro(String experiencia) {
    this.experiencia = experiencia;
}

public Arbitro(String id, String nombre, String apellido, int edad, String nacionalidad, String experiencia) {
    super(id, nombre, apellido, edad, nacionalidad);
    this.experiencia = experiencia;
}
public String getExperiencia() {
    return experiencia;
}
public void setExperiencia(String experiencia) {
    this.experiencia = experiencia;
}

}
