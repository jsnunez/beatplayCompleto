package com.jsnunez.View;

import com.jsnunez.model.Permiso;
import com.jsnunez.model.Rol;
import com.jsnunez.model.Usuario;

public class CrearUsuario {
public static Usuario start() {
    

  
    Permiso permiso = new Permiso("001", "Editar");
    Rol rol = new Rol("001", "Administrador", permiso);
    Usuario usuario = new Usuario("002", "joan", "jsnunez94@gmail.com", "123456", rol);

    return usuario;
}
}
