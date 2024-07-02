package com.jsnunez.model;

import java.util.Enumeration;
import java.util.Scanner;

import bet.Controller;

public class GestionEntrenadores {
    public static Controller controlador;
    
        public static void CrearEntrenador(Scanner sc) {
    
            Entrenadores entrenador = new Entrenadores();
            ListarEntrenadores();
            System.out.println("Ingresa el ID del Entrenador");
            String id = sc.nextLine();
            if (controlador.entrenadores.containsKey(id)) {
                System.out.println("El código del Entrenador ya existe. Por favor, intente con otro código.");
            } else 
            {
                System.out.println("Ingrese el nombre del Entrenador");
                String nombre = sc.nextLine();
                // System.out.println("Apellido");
                // String apellido = sc.nextLine();
                System.out.println("Edad:");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.println("experiencia.");
                String experiencia = sc.nextLine();
               
                sc.nextLine();
                entrenador.setId(id);
                entrenador.setNombre(nombre);
                entrenador.setEdad(edad);
             
                entrenador.setExperiencia(experiencia);
                controlador.entrenadores.put(id, entrenador);
                
                
            }
    
        }
    
        public static void EditarEntrenador(Scanner sc) {
         ListarEntrenadores();
    
         Entrenadores entrenador = new Entrenadores();
         System.out.println("Ingrese el ID del entrenador a editar.");
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
                System.out.println("Ingrese el nombre del Entrenador");
                String nombre = sc.nextLine();
                // System.out.println("Apellido");
                // String apellido = sc.nextLine();
                System.out.println("Edad:");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.println("experiencia.");
                String experiencia = sc.nextLine();
               
                sc.nextLine();
                entrenador.setId(id);
                entrenador.setNombre(nombre);
                entrenador.setEdad(edad);
             
                entrenador.setExperiencia(experiencia);
                controlador.entrenadores.put(id, entrenador);
                
    }
        }
        public static void EliminarEntrenador(Scanner sc){
            System.out.println("Ingrese el codigo del Entrenador a ELIMINAR: ");
            String codigoJ1 =sc.nextLine();
            Entrenadores je = controlador.entrenadores.remove(codigoJ1);
            if (je != null) {
                System.out.println(je.getNombre()+" ah sido ELIMINADO correctamente.");
            } else{
                System.out.println("Entrenador no encontrado");
            }
        }
        public static void ListarEntrenadores() {
    
            Enumeration<String> playerKeys = controlador.entrenadores.keys();
    
            while (playerKeys.hasMoreElements()) {
                String playerKey = playerKeys.nextElement();
                System.out.println("Key: "+ playerKey + " Nombre del entrenador: "+
                            controlador.entrenadores.get(playerKey).getNombre());
            }
    
        }
        public class controlador {
        }
    
    }
    