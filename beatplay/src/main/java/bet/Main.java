package bet;

import java.util.Scanner;

import com.jsnunez.View.Actor;
import com.jsnunez.View.Casos;
import com.jsnunez.View.PaginaPrincipal;
import com.jsnunez.View.Portada;
import com.jsnunez.View.ViewAficionados;
import com.jsnunez.View.ViewArbitros;
import com.jsnunez.View.ViewArbitrosFirstOpcion;
import com.jsnunez.View.ViewEquiposTecnicos;
import com.jsnunez.View.ViewEstadios;
import com.jsnunez.View.ViewGestionEntrenadores;
import com.jsnunez.View.ViewGestionEquipos;
import com.jsnunez.View.ViewGestionJugadores;
import com.jsnunez.View.ViewGestionNoticias;
import com.jsnunez.View.ViewGestionPartidos;
import com.jsnunez.View.ViewGestionResultado;
import com.jsnunez.View.ViewMedicosDelEquipos;
import com.jsnunez.View.ViewPatrocinios;
import com.jsnunez.View.ViewPeriodistas;
import com.jsnunez.View.inciarSesion;
import com.jsnunez.model.DatosInicio;
import com.jsnunez.model.GEstionEstadio;
import com.jsnunez.model.GestionArbitro;
import com.jsnunez.model.GestionEntrenadores;
import com.jsnunez.model.GestionEquipo;
import com.jsnunez.model.GestionJugador;
import com.jsnunez.model.GestionNoticias;
import com.jsnunez.model.GestionPartido;
import com.jsnunez.model.GestionPatrocineo;
import com.jsnunez.model.GestionResultado;
import com.jsnunez.model.Gestionincidente;
import com.jsnunez.model.UsuarioInicioSesion;
import com.jsnunez.model.VerificarInicioSeccion;

//hola15615541
public class Main {
  public static void main(String[] args) {

    Controller controlador = new Controller();
    DatosInicio.controlador = controlador;
    GestionPartido.controlador = controlador;
    GestionEquipo.controlador = controlador;
    GestionJugador.controlador = controlador;
    GestionPartido.controlador = controlador;
    GestionResultado.controlador = controlador;
    VerificarInicioSeccion.controlador = controlador;
    GestionNoticias.controlador = controlador;
    GestionEntrenadores.controlador = controlador;
    GEstionEstadio.controlador = controlador;
    GestionPatrocineo.controlador = controlador;
    GestionArbitro.controlador = controlador;
    Gestionincidente.controlador = controlador;

    com.jsnunez.model.DatosInicio.start();

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
          tipoUsuario = vs.start(usuarioSesion);
          if (tipoUsuario != null) {
            Actor a = new Actor();
            a.start();
            System.out.println("oprima enter para continuar");
            sc.nextLine();

<<<<<<< HEAD
            Casos c = new Casos();
            caso = c.start(tipoUsuario, sc);

=======
>>>>>>> 6dea9f4f162bd8f95833f0b3920e64d6a21e050e
            if (tipoUsuario == "Administrador") {

              Casos c = new Casos();
              caso = c.start(tipoUsuario, sc);
              do {
                switch (caso) {
                  case 1:
                    ViewGestionEquipos ge = new ViewGestionEquipos();
                    GestionEquipo gune = new GestionEquipo();
                    int opcionEquipos;
                    do {
                      opcionEquipos = ge.start(sc);
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
                          System.out.println("seleccione una opcion valida");
                      }
                      System.out.println("presione enter para continuar");
                      sc.nextLine();
                    } while (opcionEquipos != 5);

                    break;
                  case 2:

                    ViewGestionJugadores gj = new ViewGestionJugadores();

                    GestionJugador gunj = new GestionJugador();
                    int opcionJugadores;
                    do {
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

                      }
                    } while (opcionJugadores != 5);
                    break;

                  case 3:
                    ViewGestionPartidos gp = new ViewGestionPartidos();
                    int opcionPartidos;
                    GestionPartido gunp = new GestionPartido();

                    do {
                      opcionPartidos = gp.start(sc);
                      switch (opcionPartidos) {
                        case 1:
                          gunp.CrearPartido(sc);
                          break;

                        case 2:
                          gunp.EditarPartido(sc);
                          break;
                        case 3:
                          gunp.EliminarPartido(sc);
                          break;

                        case 4:
                          gunp.ListarPartidos();
                          break;
                        case 5:

                          break;
                        default:
                          System.out.println("seleccione una opcion valida");
                      }
                    } while (opcionPartidos != 5);
                    break;
                  case 4:
                    ViewGestionResultado vgr = new ViewGestionResultado();
                    int opcionResultado;
                    GestionResultado gr = new GestionResultado();

                    do {
                      opcionResultado = vgr.start(sc);
                      switch (opcionResultado) {
                        case 1:
                          gr.CrearResultado(sc);
                          break;

                        case 2:
                          gr.EditarResultado(sc);
                          break;
                        case 3:
                          gr.ListarResultado();
                          break;

                        case 4:

                          break;

                        default:
                          System.out.println("seleccione una opcion valida");
                      }
                    } while (opcionResultado != 4);
                    break;
                  case 5:
                    ViewGestionNoticias vgn = new ViewGestionNoticias();
                    int opcionNoticias;
                    GestionNoticias gn = new GestionNoticias();

                    do {
                      opcionResultado = vgn.start(sc);
                      switch (opcionResultado) {
                        case 1:
                          gn.CrearNoticia(sc);
                          break;

                        case 2:
                          gn.VerNoticia();
                          break;
                        case 3:
                          gn.PublicarNoticia(sc);
                          break;

                        case 4:
                          gn.EditarNoticia(sc);

                          break;
                        case 5:
                          gn.EliminarNoticia(sc);

                          break;
                        case 6:

                          break;
                        default:
                          System.out.println("seleccione una opcion valida");
                      }
                    } while (opcionResultado != 6);
                    break;

                  case 6:

                    ViewGestionEntrenadores vge = new ViewGestionEntrenadores();

                    GestionEntrenadores gen = new GestionEntrenadores();
                    int opcionEntrenadores;
                    do {
                      opcionEntrenadores = vge.start(sc);
                      switch (opcionEntrenadores) {
                        case 1:
                          gen.CrearEntrenador(sc);
                          break;

                        case 2:
                          gen.EditarEntrenador(sc);
                          break;

                        case 3:
                          gen.EliminarEntrenador(sc);

                        case 4:
                          gen.ListarEntrenadores();
                          break;
                        case 5:
                          break;
                        default:
                          System.out.println("seleccione una opcion valida");

                      }
                    } while (opcionEntrenadores != 5);
                    break;

                  case 7:
                    ViewArbitros va = new ViewArbitros();
                    GestionArbitro ga = new GestionArbitro();
                    int opcionArbitros;
                    do {
                      opcionArbitros = va.start(sc);
                      switch (opcionArbitros) {
                        case 1:
                          ga.CrearArbitros(sc);
                          break;

                        case 2:
                          ga.EditarArbitro(sc);
                          break;

                        case 3:
                          ga.EliminarArbitro(sc);

                        case 4:
                          ga.ListarArbitros();
                          break;
                        case 5:
                          break;
                        default:
                          System.out.println("seleccione una opcion valida");

                      }
                    } while (opcionArbitros != 5);

                    break;

                  case 8:
                    ViewEstadios ve = new ViewEstadios();
                    GEstionEstadio ges = new GEstionEstadio();
                    int opcionEstadio;
                    do {
                      opcionEstadio = ve.start(sc);
                      switch (opcionEstadio) {
                        case 1:
                          ges.CrearEstadio(sc);
                          break;

                        case 2:
                          ges.EditarEstadio(sc);
                          break;

                        case 3:
                          ges.EliminarEstadio(sc);

                        case 4:
                          ges.ListarEstadio();
                          break;
                        case 5:
                          break;
                        default:
                          System.out.println("seleccione una opcion valida");

                      }
                    } while (opcionEstadio != 5);

                    break;

                  case 9:
                    ViewPatrocinios vPatrocinios = new ViewPatrocinios();
                    GestionPatrocineo gPatrocineo = new GestionPatrocineo();
                    int opcionPatrocineo;
                    do {
                      opcionPatrocineo = vPatrocinios.start(sc);
                      switch (opcionPatrocineo) {
                        case 1:
                          gPatrocineo.CrearPatrocinador(sc);
                          break;

                        case 2:
                          gPatrocineo.EditarPatrocinador(sc);
                          break;

                        case 3:
                          gPatrocineo.EliminarPatrocinador(sc);

                        case 4:
                          gPatrocineo.ListarPatrocinador();
                          break;
                        case 5:
                          break;
                        default:
                          System.out.println("seleccione una opcion valida");

                      }
                    } while (opcionPatrocineo != 5);

                    break;

                  case 10:
                    break;

                  case 11:
                    System.out.println("1. Crear incidente");
                    System.out.println("2.. Listar incidente");
                    System.out.println("3.. Salir");
                    int opcionIncidente = sc.nextInt();
                    sc.nextLine();
                    switch (opcionIncidente) {
                      case 1:
                        Gestionincidente.CrearIncidente(sc);
                        System.out.println("enter para continuar");
                        sc.nextLine();
                        break;
                      case 2:
                        Gestionincidente.ListarIncidente();
                        System.out.println("enter para continuar");
                        sc.nextLine();
                        break;
                      default:
                        System.out.println("Seleccione un aopcion validad");
                        break;
                    }

                    break;

                  case 12:
                    break;

                  case 13:
                    break;

                  case 14:
                    break;

                  default:
                    System.out.println("Opcion no valida");
                    break;
                }

                caso = c.start(tipoUsuario, sc);

              } while (caso != 5);
            }
            if (tipoUsuario == "Aficionado") {
              ViewAficionados.start();

            }

            if (tipoUsuario == "Periodista") {
              ViewPeriodistas.start();              

            }

            if (tipoUsuario == "Equipo Técnico") {

              ViewEquiposTecnicos.start();

              
            }

            if (tipoUsuario == "Árbitro") {

              ViewArbitrosFirstOpcion.star();

            }

            if (tipoUsuario == "Médico del Equipo") {

              ViewMedicosDelEquipos.star();

            }
<<<<<<< HEAD
          }
=======
>>>>>>> 6dea9f4f162bd8f95833f0b3920e64d6a21e050e

          // Salir del bucle si se llega a un caso de finalización

        }
      }
    }
  }

}

}