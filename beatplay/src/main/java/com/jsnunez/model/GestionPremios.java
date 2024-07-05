package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class GestionPremios {

    public static Controller controlador;
public static void CrearPremio(Scanner sc){

System.out.println("ingrese id premio");
String idPremio= sc.nextLine();
System.out.println("ingrese nombre del premio");
String nombrepremio=sc.nextLine();
System.out.println("Ingrese descripcion");
String descripcion=sc.nextLine();
System.out.println("Ingrese criterio");
String criterio=sc.nextLine();
System.out.println("Ingrese fecha");
String fecha=sc.nextLine();
System.out.println("seleccione destinatario:");
System.out.println("1. equipo");
System.err.println("2. jugador");
int opcionDestinatario=sc.nextInt();
sc.nextLine();
switch (opcionDestinatario) {
    case 1:
        GestionEquipo.ListarEquipos();
        System.out.println("seleccionar id equipo");
        String idequipo=sc.nextLine();
        String equipoSeleccionado=controlador.equipos.get(idequipo).getNombre();
        Premios premio =new Premios(idPremio, nombrepremio,descripcion, criterio, equipoSeleccionado, fecha) ;
        controlador.premios.put(idPremio, premio);
        break;

        case 2:
        GestionJugador.ListarJugadores();
        System.out.println("seleccionar id jugador");
        String idjugador=sc.nextLine();
        String jugadroSelecionado=controlador.jugadores.get(idjugador).getNombre();
        Premios premioj =new Premios(idPremio, nombrepremio,descripcion, criterio, jugadroSelecionado, fecha) ;
        controlador.premios.put(idPremio, premioj);
        break;
    default:
        break;
}

}}
