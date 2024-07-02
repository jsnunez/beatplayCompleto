package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GEstionEstadio {
    public static Controller controlador;
    
        public static void CrearEstadio(Scanner sc) {
    
    estadio estadio = new estadio();
    ListarEstadio();
    System.out.println("Ingresa el ID del Estadio");
    String id = sc.nextLine();
    if (controlador.estadios.containsKey(id)) {
        System.out.println("El código del Estadio ya existe. Por favor, intente con otro código.");
    } else 
    {
        System.out.println("Ingrese el nombre del Estadio");
        String nombre = sc.nextLine();
   
        System.out.println("ubicacion.");
        String ubicacion = sc.nextLine();
       
        System.out.println("capacidad.");
        int capacidad = sc.nextInt();
        sc.nextLine();

        estadio.setId(id);
        estadio.setNombre(nombre);
        estadio.setUbicacion(ubicacion);
        estadio.setCapacidad(capacidad);
     
        controlador.estadios.put(id, estadio);
        
        
    }

}

public static void EditarEstadio(Scanner sc) {
 ListarEstadio();

 estadio estadio = new estadio();
 System.out.println("Ingrese el ID del estadio a editar.");
    String id =sc.nextLine();
    while (!controlador.estadios.containsKey(id) | id=="salir") {
        System.out.println("Opcion no valida seleccione un estadio existente para continuar o escriba salir");
        id = sc.nextLine();
        if (id.equals("salir")) {
            break;
        }
    }
    if (id.equals("salir")) {
    }else{ System.out.println("Ingrese el nombre del Estadio");
    String nombre = sc.nextLine();

    System.out.println("ubicacion.");
    String ubicacion = sc.nextLine();
   
    System.out.println("capacidad.");
    int capacidad = sc.nextInt();
    sc.nextLine();

    estadio.setId(id);
    estadio.setNombre(nombre);
    estadio.setUbicacion(ubicacion);
    estadio.setCapacidad(capacidad);
 
    controlador.estadios.put(id, estadio);
        
}
}
public static void EliminarEstadio(Scanner sc){
    ListarEstadio();
    System.out.println("Ingrese el codigo del Estadio a ELIMINAR: ");
    String codigoJ1 =sc.nextLine();
    estadio je = controlador.estadios.remove(codigoJ1);
    if (je != null) {
        System.out.println(je.getNombre()+" ah sido ELIMINADO correctamente.");
    } else{
        System.out.println("Estadio no encontrado");
    }
}
public static void ListarEstadio() {

    Enumeration<String> playerKeys = controlador.estadios.keys();

    while (playerKeys.hasMoreElements()) {
        String playerKey = playerKeys.nextElement();
        System.out.println("Key: "+ playerKey + " Nombre del arbitro: "+
                    controlador.estadios.get(playerKey).getNombre());
    }

}
}
