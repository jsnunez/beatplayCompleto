package com.jsnunez.model;

public class Entrenadores extends Personas{
String experiencia;

public Entrenadores() {

}

public Entrenadores(String experiencia) {
    this.experiencia = experiencia;
}

public Entrenadores(String id, String nombre, String apellido, int edad, String nacionalidad, String experiencia) {
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
