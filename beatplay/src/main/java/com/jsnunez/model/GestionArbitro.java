package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionArbitro {
    public static Controller controlador;
    
        public static void CrearArbitros(Scanner sc) {
    
    Arbitro arbitro = new Arbitro();
    ListarArbitros();
    System.out.println("Ingresa el ID del Arbitro");
    String id = sc.nextLine();
    if (controlador.arbitros.containsKey(id)) {
        System.out.println("El código del Arbitro ya existe. Por favor, intente con otro código.");
    } else 
    {
        System.out.println("Ingrese el nombre del Arbitro");
        String nombre = sc.nextLine();
        // System.out.println("Apellido");
        // String apellido = sc.nextLine();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("experiencia.");
        String experiencia = sc.nextLine();
       
        sc.nextLine();
        arbitro.setId(id);
        arbitro.setNombre(nombre);
        arbitro.setEdad(edad);
     
        arbitro.setExperiencia(experiencia);
        controlador.arbitros.put(id, arbitro);
        
        
    }

}

public static void EditarArbitro(Scanner sc) {
 ListarArbitros();

 Arbitro arbitro = new Arbitro();
 System.out.println("Ingrese el ID del arbitro a editar.");
    String id =sc.nextLine();
    while (!controlador.jugadores.containsKey(id) | id=="salir") {
        System.out.println("Opcion no valida seleccione un jugador existente para continuar o escriba salir");
        id = sc.nextLine();
        if (id.equals("salir")) {
            break;
        }
    }
    if (id.equals("salir")) {
    }else{
        System.out.println("Ingrese el nombre del Arbitro");
        String nombre = sc.nextLine();
        // System.out.println("Apellido");
        // String apellido = sc.nextLine();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("experiencia.");
        String experiencia = sc.nextLine();
       
        sc.nextLine();
        arbitro.setId(id);
        arbitro.setNombre(nombre);
        arbitro.setEdad(edad);
     
        arbitro.setExperiencia(experiencia);
        controlador.arbitros.put(id, arbitro);
        
}
}
public static void EliminarArbitro(Scanner sc){
    ListarArbitros();
    System.out.println("Ingrese el codigo del Arbitro a ELIMINAR: ");
    String codigoJ1 =sc.nextLine();
    Arbitro je = controlador.arbitros.remove(codigoJ1);
    if (je != null) {
        System.out.println(je.getNombre()+" ah sido ELIMINADO correctamente.");
    } else{
        System.out.println("Arbitro no encontrado");
    }
}
public static void ListarArbitros() {

    Enumeration<String> playerKeys = controlador.arbitros.keys();

    while (playerKeys.hasMoreElements()) {
        String playerKey = playerKeys.nextElement();
        System.out.println("Key: "+ playerKey + " Nombre del arbitro: "+
                    controlador.arbitros.get(playerKey).getNombre());
    }

}
}
