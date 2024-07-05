package com.jsnunez.model;

import java.util.Scanner;


import bet.Controller;


public class GestionTransferencias {
    public static Controller controlador;
public static void Transferencia(Scanner sc){
    System.out.println("Seleccionar id tranferir");
String id= sc.nextLine();
GestionJugador.ListarJugadores();

System.out.println("Seleccionar id del jugador a tranferir");
String idjugador= sc.nextLine();
Player jugadortranferir=controlador.jugadores.get(idjugador);

System.out.println("El jugador actualmente se encuentra en el equipo: "+jugadortranferir.getEquipo());
System.out.println("Seleccione el equipo destino");
GestionEquipo.ListarEquipos();
String idequipo2=sc.nextLine();

System.out.println("seleccionaste al:"+controlador.equipos.get(idequipo2).getNombre());
System.out.println("Ingrese monto de la transferencia");
int monto =sc.nextInt();
sc.nextLine();
System.out.println("Ingrese fecha transferencia");
String fecha =sc.nextLine();

Transferencias tranferencia = new Transferencias();
tranferencia.setJugador(jugadortranferir);
tranferencia.setEquipoOrigen(jugadortranferir.getEquipo());
tranferencia.setEquipoDestino(controlador.equipos.get(idequipo2));
tranferencia.setMonto(monto);
tranferencia.setFecha(fecha);
controlador.transferencias.put(id, tranferencia);


}

}
