package bet;


import java.util.Scanner;
import com.jsnunez.View.*;
import com.jsnunez.model.*;


public class Main {
  public static void main(String[] args) {

    Controller controlador  = new Controller();
    DatosInicio.controlador= new Controller();
   
    Permiso permiso = new Permiso("001", "Editar");
    Rol rol = new Rol("001", "Administrador", permiso);
    Usuario usuario = new Usuario("001", "", "jsnunez@gmail.com", "", rol);
    UsuarioInicioSesion usuarioSesion = null;
    String tipoUsuario = null;



    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        Portada p = new Portada();
        // p.start();
        PaginaPrincipal pp = new PaginaPrincipal();
        int tipoSeccion = pp.start(sc);
        if (tipoSeccion == 1) {
          inciarSesion is = new inciarSesion();

          usuarioSesion = is.start(sc);
          VerificarInicioSeccion vs = new VerificarInicioSeccion();
          tipoUsuario = vs.start(usuarioSesion, usuario);
          Actor a = new Actor();
          a.start();

          Casos c = new Casos();
          int caso = c.start(tipoUsuario, sc);

          switch (caso) {
            case 1:
              GestionEquipos ge = new GestionEquipos();
              int opcionEquipos =ge.start(sc);
switch (opcionEquipos) {
    case 1:
    CrearEquipo ce = new  CrearEquipo();
        ce.start(sc);
        break;
    default:
        throw new AssertionError();
}
              break;

            case 2:
              GestionJugadores gj = new GestionJugadores();
              gj.start(sc);
              break;

            case 3:
              GestionPartidos gp = new GestionPartidos();
              gp.start(sc);

            default:
            System.out.println("Opcion no valida");
            break;
          }

          System.out.println(caso);

        }

        if (tipoSeccion == 2) {
          System.exit(0);
          // CrearUsuario cu = new CrearUsuario();
          // Usuario newUser =cu.start();
          // System.out.println(newUser.getNombre());
        }

        // Salir del bucle si se llega a un caso de finalización

      }
    }
  }
}