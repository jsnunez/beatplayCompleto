package com.jsnunez.model;

public class Cerrarsesion {


    public static void start() {    System.out.println("Vuelve pronto");
    System.out.println("Cerrando sesion");
    for (int i = 0; i < 50; i++) {
        System.out.print(".");
        try {
            Thread.sleep(5 * 5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    }

}
