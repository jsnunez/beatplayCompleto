package com.jsnunez.View;

import java.io.Console;
import java.util.Scanner;

import com.jsnunez.model.Clc;
import com.jsnunez.model.UsuarioInicioSesion;

public class inciarSesion {

    public UsuarioInicioSesion start(Scanner sc) {
        char[] pass = null;
        String password = null;
    Clc.clc();
        System.out.println("Ingrese nombre usuario");
        String user = sc.nextLine();

        // Intentar obtener la contraseña usando Console, si está disponible
        Console console = System.console();
        if (console != null) {
            pass = console.readPassword("Ingrese contraseña: ");
            password = String.valueOf(pass);
        } else {
            // Si Console no está disponible, usar Scanner para obtener la contraseña
            System.out.println("Ingrese contraseña");
            password = sc.nextLine();
        }

        return new UsuarioInicioSesion(user, password);
    }
}
