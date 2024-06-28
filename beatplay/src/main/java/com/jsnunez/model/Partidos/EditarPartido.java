package com.jsnunez.model.Partidos;

import java.util.Enumeration;
import java.util.Scanner;

import com.jsnunez.model.Partido;

import bet.Controller;

public class EditarPartido {
 public static Controller controlador;

public static void start(Scanner sc) {
    Partido partido = new Partido();
    Enumeration<String> teamKeys = controlador.Partidos.keys();

                    while (teamKeys.hasMoreElements()) {
                        String teamKey = teamKeys.nextElement();
                        System.out.println("Key: " + teamKey + " Nombre del equipo: " +
                                controlador.equipos.get(teamKey).getNombre());
                    }
        System.out.println("Ingrese id del partido a editar");
        String id = sc.nextLine();
        
        System.out.println("Ingrese id del equipo local");
        String equipoLocal = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoLocal).getNombre());
        System.out.println("Ingrese id del equipo visitante");
        String equipoVisitante = sc.nextLine();
        System.out.println(controlador.equipos.get(equipoVisitante).getNombre());

        
        System.out.println("Ingrese fecha del partido");
        String fecha = sc.nextLine();


        System.out.println("Ingrese hora del partido");
        String hora = sc.nextLine();

        System.out.println("Ingrese id estadio del partido");

        String idEstadio = sc.nextLine();

        System.out.println(controlador.estadios.get(idEstadio).getNombre());

        

        partido.setId(id);
        partido.setEquipoLocal(controlador.equipos.get(equipoLocal));        
        partido.setEquipoVisitante(controlador.equipos.get(equipoVisitante));
        partido.setFecha(fecha);
        partido.setHora(hora);
        partido.setEstadio(controlador.estadios.get(idEstadio));

        controlador.Partidos.put(id, partido);
       
    }
}
