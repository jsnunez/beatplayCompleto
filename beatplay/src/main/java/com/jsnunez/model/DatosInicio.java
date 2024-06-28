package com.jsnunez.model;

import bet.Controller;

public class DatosInicio {

public static Controller controlador;

public static void start() {



    Permiso permiso = new Permiso("001", "Editar");
    controlador.permisos.put("001", permiso);
    Rol rol = new Rol("001", "Administrador", permiso);
    controlador.roles.put("001", rol);
    Usuario usuario = new Usuario("001", "admin", "jsnunez@gmail.com", "123", rol);

    controlador.usuarios.put("001", usuario);
}
}
