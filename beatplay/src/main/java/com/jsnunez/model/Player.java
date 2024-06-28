package com.jsnunez.model;

import java.util.List;

public class Player {
String id;
String nombre;
int edad;
String Posicion;
String nacionalidad;
int numeroCamisetas;
Team equipo;
List <Lesion> listLesiones;
List <rendimiento> listRendimiento;
public Player() {


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
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getPosicion() {
    return Posicion;
}
public void setPosicion(String posicion) {
    Posicion = posicion;
}
public String getNacionalidad() {
    return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
}
public int getNumeroCamisetas() {
    return numeroCamisetas;
}
public void setNumeroCamisetas(int numeroCamisetas) {
    this.numeroCamisetas = numeroCamisetas;
}
public Team getEquipo() {
    return equipo;
}
public void setEquipo(Team equipo) {
    this.equipo = equipo;
}
public List<Lesion> getListLesiones() {
    return listLesiones;
}
public void setListLesiones(Lesion lesion) {
    this.listLesiones.add(lesion);
}
public List<rendimiento> getListRendimiento() {
    return listRendimiento;
}
public void setListRendimiento(rendimiento rendimiento) {
    this.listRendimiento.add(rendimiento);
}

}
