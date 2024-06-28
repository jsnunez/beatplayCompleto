package bet;

import java.util.Scanner;
import com.jsnunez.View.*;
import com.jsnunez.model.*;
import com.jsnunez.model.Partidos.CrearPartido;
import com.jsnunez.model.Partidos.EditarPartido;

public class Main {
  public static void main(String[] args) {

    Controller controlador = new Controller();
    DatosInicio.controlador = controlador;
    CrearEquipo.controlador = controlador;
    EliminarEquipo.controlador = controlador;
    ListarEquipos.controlador = controlador;
    EditarEquipo.controlador = controlador;
    CrearPartido.controlador = controlador;
    EditarPartido.controlador = controlador;

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
                GestionEquipos ge = new GestionEquipos();
                int opcionEquipos = ge.start(sc);

                switch (opcionEquipos) {
                  case 1:
                    CrearEquipo ce = new CrearEquipo();
                    ce.start(sc);
                    break;

                  case 2:
                    EditarEquipo ede = new EditarEquipo();
                    ede.start(sc);
                    break;
                  case 3:
                    EliminarEquipo ee = new EliminarEquipo();
                    ee.start(sc);
                    break;

                  case 4:
                    ListarEquipos le = new ListarEquipos();
                    le.start(sc);
                    break;
                  case 5:

                    break;
                  default:
                    throw new AssertionError();
                }
                break;

              case 2:
                GestionJugadores gj = new GestionJugadores();
                int opcionJugadores = gj.start(sc);

                switch (opcionJugadores) {
                  case 1:
                    CrearJugadores cj = new CrearJugadores();
                    cj.start(sc);
                    break;

                  case 2:
                    EditarJugadores ej = new EditarJugadores();
                    ej.start(sc);
                    break;

                  case 3:
                    EliminarJugadores elj = new EliminarJugadores();
                    elj.start(sc);

                  case 4:
                    ListarJugadores lj = new ListarJugadores();
                    lj.start(sc);
                    break;

                  default:
                    throw new AssertionError();

                }
                break;

              case 3:
                GestionPartidos gp = new GestionPartidos();
                int opcionPartidos = gp.start(sc);

                switch (opcionPartidos) {
                  case 1:
                    CrearPartido cp = new CrearPartido();
                    cp.start(sc);
                    break;

                  case 2:
                    EditarPartido edp = new EditarPartido();
                    edp.start(sc);
                    break;
                  case 3:
                    EliminarEquipo ee = new EliminarEquipo();
                    ee.start(sc);
                    break;

                  case 4:
                    ListarEquipos le = new ListarEquipos();
                    le.start(sc);
                    break;
                  case 5:

                    break;
                  default:
                    throw new AssertionError();
                }
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