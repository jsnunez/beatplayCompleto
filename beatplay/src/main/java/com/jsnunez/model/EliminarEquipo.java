package com.jsnunez.model;

import java.util.Scanner;

import bet.Controller;

public class EliminarEquipo {
public static Controller controlador;

public static void start(Scanner sc) {
    System.out.println("Ingrese codigo del equipo a eliminar :");
    String codigoEl = sc.nextLine();
    Team ee = controlador.equipos.remove(codigoEl);
    if (ee != null) {
        System.out.println("El equipo eliminado fue " + ee.getNombre());
    } else {
        System.out.println("equipo no encontrado.");
    }
 
}
}
