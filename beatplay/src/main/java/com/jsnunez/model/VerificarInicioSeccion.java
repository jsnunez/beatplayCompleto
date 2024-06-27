package com.jsnunez.model;

public class VerificarInicioSeccion {


    public static String start(UsuarioInicioSesion usuario,Usuario usuarioRegistrado) {

  
        if (usuario.getUser().equals(usuarioRegistrado.getNombre()) && usuario.getPass().equals(usuarioRegistrado.getPassword())) {
            System.out.println("El usuario inicio correctamente como " + usuarioRegistrado.getRol().getNombre());

            return usuarioRegistrado.getRol().getNombre();
        }
        else{
            System.out.println("Error en el Usuario o contraseña");
            return null;
        }
       
        
    }
}
