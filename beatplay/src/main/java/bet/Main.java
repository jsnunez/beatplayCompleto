package bet;

import java.util.Scanner;
import com.jsnunez.View.*;
import com.jsnunez.model.*;

public class Main {
  public static void main(String[] args) {

    Controller controlador = new Controller();
    DatosInicio.controlador = controlador;

    GestionPartido.controlador = controlador;
    GestionEquipo.controlador = controlador;
    GestionJugador.controlador = controlador;

    com.jsnunez.model.DatosInicio.start();
    Permiso permiso = new Permiso("001", "Editar");
    Rol rol = new Rol("001", "Administrador", permiso);
    Usuario usuario = new Usuario("001", "", "jsnunez@gmail.com", "", rol);
    UsuarioInicioSesion usuarioSesion = null;
    String tipoUsuario = null;
    int caso;

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
          caso = c.start(tipoUsuario, sc);
          do {
            switch (caso) {
              case 1:
                ViewGestionEquipos ge = new ViewGestionEquipos();
                GestionEquipo gune = new GestionEquipo();
                int opcionEquipos; 
do{
 opcionEquipos= ge.start(sc);
                switch (opcionEquipos) {
                  
                  case 1:
                    gune.CrearEquipo(sc);
                    break;

                  case 2:
                    gune.EditarEquipo(sc);
                    break;
                  case 3:
                    gune.EliminarEquipo(sc);
                    break;

                  case 4:
                    gune.ListarEquipos(sc);
                    break;
                    case 5:
                 
                    break;
                  default:
                    throw new AssertionError();
                
                  }
                  

              } while (opcionEquipos != 5);
                
              break;
              case 2:


                ViewGestionJugadores gj = new ViewGestionJugadores();
               
                GestionJugador gunj = new GestionJugador();
                int opcionJugadores;
do{
  opcionJugadores = gj.start(sc);
                switch (opcionJugadores) {
                  case 1:
                    gunj.CrearJugador(sc);
                    break;

                  case 2:
                    gunj.EditarJugador(sc);
                    break;

                  case 3:
                    gunj.EliminarJugador(sc);

                  case 4:
                    gunj.ListarJugadores(sc);
                    break;
                    case 5:
                    break;
                  default:
                    throw new AssertionError();

                }}
                while (opcionJugadores !=5) ;
                break;

              case 3:
                ViewGestionPartidos gp = new ViewGestionPartidos();
                int opcionPartidos ;
                GestionPartido gunp = new GestionPartido();

                do{
                  opcionPartidos = gp.start(sc);
                switch (opcionPartidos) {
                  case 1:
                    gunp.CrearPartido(sc);
                    break;

                  case 2:
                    gunp.EditarPartido(sc);
                    break;
                  case 3:

                    break;

                  case 4:

                    break;
              
                  default:
                    throw new AssertionError();
                  }}
                  while (opcionPartidos !=4) ;
                  break;

              default:
                System.out.println("Opcion no valida");
                break;
            }

            caso = c.start(tipoUsuario, sc);

          } while (caso != 5);
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

  private static DatosInicio DatosInicio() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'DatosInicio'");
  }
}