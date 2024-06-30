package com.jsnunez.model;

import java.util.ArrayList;
import java.util.List;

public class Player extends Personas{

String Posicion;

int numeroCamisetas;
Team equipo;
List <Lesion> listLesiones;
List <rendimiento> listRendimiento;
public Player() {
    
    listLesiones = new ArrayList<Lesion>();    
    listRendimiento = new ArrayList<rendimiento>();

}
public Player(String posicion, int numeroCamisetas, Team equipo, List<Lesion> listLesiones,
        List<rendimiento> listRendimiento) {
    Posicion = posicion;
    this.numeroCamisetas = numeroCamisetas;
    this.equipo = equipo;
    this.listLesiones = listLesiones;
    this.listRendimiento = listRendimiento;
}
public Player(String id, String nombre, String apellido, int edad, String nacionalidad, String posicion,
        int numeroCamisetas, Team equipo, List<Lesion> listLesiones, List<rendimiento> listRendimiento) {
    super(id, nombre, apellido, edad, nacionalidad);
    Posicion = posicion;
    this.numeroCamisetas = numeroCamisetas;
    this.equipo = equipo;
    this.listLesiones = listLesiones;
    this.listRendimiento = listRendimiento;
}
public String getPosicion() {
    return Posicion;
}
public void setPosicion(String posicion) {
    Posicion = posicion;
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
