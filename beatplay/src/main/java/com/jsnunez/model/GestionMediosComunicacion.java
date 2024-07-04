package com.jsnunez.model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import bet.Controller;

public class GestionMediosComunicacion {

    public static Controller controlador;

    public static void CrearMedio(Scanner sc) {
        MedioDeComunicacion medio = new MedioDeComunicacion();

        System.out.println("Ingrese ID");
        String id = sc.nextLine();
        if (controlador.medios.containsKey(id)) {
            System.out.println("El código del medio ya existe. Por favor, intente con otro código.");
        } else {
            System.out.println("Ingrese nombre del medio");
            String nombre = sc.nextLine();
            System.out.println("Ingresa tipo de medio.");
            String tipo = sc.nextLine();
            medio.setId(id);
            medio.setNombre(nombre);
            medio.setTipoMedio(tipo);

            ListarPeriodistas();
            int masP = 0;
            String idPeriodista;
            while (masP == 0) {
                System.out.println("seleccione id del preiodista o escriba cancelar");

                idPeriodista = sc.nextLine();
                if (idPeriodista.equals("cancelar")) {
                    masP = 1;
                    break;
                }
                if (controlador.usuarios.get(idPeriodista).getRol().getId().equals("003")) {
                    Usuario periodista = controlador.usuarios.get(idPeriodista);
                    medio.setListPeriodistas(periodista);
                    controlador.medios.put(id, medio);
                    System.out.println("Desea agregar otro periodista");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int agregarp = sc.nextInt();
                    sc.nextLine();

                    if (agregarp == 2) {

                        masP = 1;

                    }
                    controlador.medios.put(id, medio);
                } else {
                    System.out.println("Error seleccione un Id de un periodista");
                }

            }
        }
    }

    public static void EditarMedio(Scanner sc) {
        MedioDeComunicacion medio = new MedioDeComunicacion();

        ListarMedio();
        System.out.println("seleccione ID del medio a editar");
        String id = sc.nextLine();

        if (controlador.medios.containsKey(id)) {
            MedioDeComunicacion medios = new MedioDeComunicacion();

            System.out.println("Ingrese nombre del medio de comunicacion");
            String nombre = sc.nextLine();
            System.out.println("Ingresa tipo de medio.");
            String tipo = sc.nextLine();
            System.out.println("Desea modificar el listado de periodistas");
            System.out.println("1. Si");
            System.out.println("2. No");
            int modfP = sc.nextInt();
            sc.nextLine();
            while (modfP != 2) {

                switch (modfP) {
                    case 1:
                        System.out.println("1. agregar");
                        System.out.println("2. eliminar");

                        int OpcionA = sc.nextInt();
                        sc.nextLine();

                        switch (OpcionA) {
                            case 1:

                                ListarPeriodistas();
                                int masP = 0;
                                String idPeriodista;
                                while (masP == 0) {
                                    System.out.println("seleccione id del preiodista o escriba cancelar");

                                    idPeriodista = sc.nextLine();
                                    if (idPeriodista.equals("cancelar")) {
                                        masP = 1;
                                        break;
                                    }
                                    if (controlador.usuarios.get(idPeriodista).getRol().getId().equals("003")) {
                                        Usuario periodista = controlador.usuarios.get(idPeriodista);
                                        medio.setListPeriodistas(periodista);
                                        controlador.medios.put(id, medio);
                                        System.out.println("Desea agregar otro periodista");
                                        System.out.println("1. Si");
                                        System.out.println("2. No");
                                        int agregarp = sc.nextInt();
                                        sc.nextLine();
                                        medio.setListPeriodistas(periodista);
                                        if (agregarp == 2) {

                                            masP = 1;

                                        }
                                        controlador.medios.put(id, medio);
                                    } else {
                                        System.out.println("Error seleccione un Id de un periodista");
                                    }

                                }

                                break;
                            case 2:
                                medio = controlador.medios.get(id);
                                List<Usuario> listPeriodistas = new ArrayList<Usuario>();
                                listPeriodistas = medio.getListPeriodistas();
                                int con = -1;
                                for (Usuario n : listPeriodistas) {
                                    con++;
                                    System.out.println("ID: " + con + " Nombre: " + n.getNombre());

                                }
                                System.out.println("escriba id a eliminar");
                                listPeriodistas.remove(sc.nextInt());
                                sc.nextLine();
                                medio.modiListPeriodistas(listPeriodistas);
                                break;
                            default:
                                System.out.println("no selecciono una opcion valida");
                                break;
                        }

                        break;
                    default:
                        System.out.println("seleccione una opcion valida");
                        modfP = sc.nextInt();
                        sc.nextLine();
                        break;
                }
            }

        }
    }

    public static void EliminarMedio(Scanner sc) {
        ListarMedio();
        System.out.println("seleccione ID del medio a eliminar");
        String id =sc.nextLine();
        controlador.medios.remove(id);


    }

    public static void ListarMedio() {
        Enumeration<String> teamKeyse = controlador.medios.keys();
        while (teamKeyse.hasMoreElements()) {
            String teamKeye = teamKeyse.nextElement();
            System.out.println("ID: " + teamKeye + " Nombre del medio: " +
                    controlador.medios.get(teamKeye).getNombre());
        }
    }

    public static void ListarPeriodistas() {
        Enumeration<String> teamKeys = controlador.usuarios.keys();

        while (teamKeys.hasMoreElements()) {

            String teamKey = teamKeys.nextElement();
            if (controlador.usuarios.get(teamKey).getRol().getId().equals("003")) {

                System.out.println("ID: " + teamKey + " Nombre del periodista: " +
                        controlador.usuarios.get(teamKey).getNombre());
            }

        }
    }
}