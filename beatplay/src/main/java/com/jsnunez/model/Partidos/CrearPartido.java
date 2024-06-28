package com.jsnunez.model.Partidos;

import java.util.Scanner;

import com.jsnunez.model.Partido;
import com.jsnunez.model.Team;

import bet.Controller;

public class CrearPartido {
    public static Controller controlador;

    public static void start(Scanner sc) {

        Partido partido=new Partido();

        System.out.println("Ingrese id del partido");
        String id = sc.nextLine();
        if (controlador.Partidos.containsKey(id)) {
            System.out.println("El código del partido ya existe. Por favor, intente con otro código.");
        } else {
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
}
