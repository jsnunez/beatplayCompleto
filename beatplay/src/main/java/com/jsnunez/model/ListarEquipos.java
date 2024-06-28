package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class ListarEquipos {
public static Controller controlador;

public void start(Scanner sc){

           Enumeration<String> teamKeys = controlador.equipos.keys();

                    while (teamKeys.hasMoreElements()) {
                        String teamKey = teamKeys.nextElement();
                        System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                                controlador.equipos.get(teamKey).getNombre());
                    }
    
}
}
