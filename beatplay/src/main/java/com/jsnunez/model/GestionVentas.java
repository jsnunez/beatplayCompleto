package com.jsnunez.model;

import java.util.Scanner;

import com.jsnunez.model.GestionEntrenadores.controlador;

public class GestionVentas {

    public static void start(Scanner sc) {
GestionPartido.ListarPartidos();
System.out.println("Seleccione id partido");

String idpartido= sc.nextLine();

GestionUsuarios.ListarUsuarios();;
System.out.println("Seleccione id usuario");

String idUser= sc.nextLine();


System.out.println("Seleccione cantidad de entradas");
int cantidad = sc.nextInt();
sc.nextLine();
System.out.println("Seleccione ubicacion");

String ubicacion= sc.nextLine();
System.out.println("Seleccione precio");

String precio= sc.nextLine();



Entrada entrada = new Entrada(idpartido, , null, precio, cantidad, cantidad, ubicacion);

    }



}
