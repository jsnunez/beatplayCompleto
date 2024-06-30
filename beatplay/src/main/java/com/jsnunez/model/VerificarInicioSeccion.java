package com.jsnunez.model;

import java.util.Enumeration;

import bet.Controller;

public class VerificarInicioSeccion {

    public static Controller controlador;

    public static String start(UsuarioInicioSesion usuario) {
        Usuario usuarioRegistrado = new Usuario();

        Enumeration<String> teamKeys = controlador.usuarios.keys();

        while (teamKeys.hasMoreElements()) {
            String teamKey = teamKeys.nextElement();
            usuarioRegistrado= controlador.usuarios.get(teamKey);
           

                    if (usuarioRegistrado.getNombre().equals(usuario.getUser())
                    && usuarioRegistrado.getPassword().equals(usuario.getPass())) {
        
                System.out.println("El usuario inicio correctamente como " + usuarioRegistrado.getRol().getNombre());
        
                return usuarioRegistrado.getRol().getNombre();
            }
        }
        
            if (usuarioRegistrado.getNombre().equals(usuario.getUser())
            && usuarioRegistrado.getPassword().equals(usuario.getPass())) {

        System.out.println("El usuario inicio correctamente como " + usuarioRegistrado.getRol().getNombre());

        return usuarioRegistrado.getRol().getNombre();
    } else {
        System.out.println("Error en el Usuario o contraseña");
        return null;
    }

        
    

    

    }
}
