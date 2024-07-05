package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class GestionEquipamento {

    public static Controller controlador;
public static void CrearEquipamento(Scanner sc){


System.out.println("Ingresar id de equipamento");
String id = sc.nextLine();
System.out.println("Ingrese tipo");
String tipo= sc.nextLine();
System.out.println("Ingrese cantidad");
int cantidad= sc.nextInt();
sc.nextLine();
System.out.println("Seleccione id equipo asociado");
GestionEquipo.ListarEquipos();
String idequipo=sc.nextLine();
Team equipo = controlador.equipos.get(idequipo);
System.out.println("Ingrese fecha");
String fecha=sc.nextLine();
Equipamiento equipamiento = new Equipamiento(id,tipo , cantidad, equipo, fecha);
controlador.equipamiento.put(id, equipamiento);

}

}
