package com.jsnunez.model;

import java.util.Scanner;

import com.jsnunez.View.ViewGestionJugadores;

public class GestionAficionados {

public static void visualizacion(Scanner sc){

System.out.println("Seleccione tipo de estadistica:");
System.out.println("1. Jugador");
System.out.println("2. Equipos");
System.out.println("3. Temporada");
int opciontipo= sc.nextInt();
sc.nextLine();
switch (opciontipo) {
    case 1:
    GestionJugador.ListarJugadores();
        break;

    default:
        break;
}


}


}
