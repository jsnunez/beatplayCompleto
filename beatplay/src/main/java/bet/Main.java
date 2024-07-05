package bet;

import java.util.Scanner;

import com.jsnunez.View.Actor;
import com.jsnunez.View.PaginaPrincipal;
import com.jsnunez.View.ViewAficionados;
import com.jsnunez.View.ViewArbitrosFirstOpcion;
import com.jsnunez.View.ViewEquiposTecnicos;
import com.jsnunez.View.ViewGestionNoticias;
import com.jsnunez.View.ViewMedicosDelEquipos;
import com.jsnunez.View.ViewPeriodistas;
import com.jsnunez.View.inciarSesion;
import com.jsnunez.model.Cerrarsesion;
import com.jsnunez.model.Clc;
import com.jsnunez.model.DatosInicio;
import com.jsnunez.model.GEstionEstadio;
import com.jsnunez.model.GestionAdministrador;
import com.jsnunez.model.GestionAficionados;
import com.jsnunez.model.GestionArbitro;
import com.jsnunez.model.GestionCompletaEntrenadores;
import com.jsnunez.model.GestionCompletaJugadores;
import com.jsnunez.model.GestionEntrenadores;
import com.jsnunez.model.GestionEquipamento;
import com.jsnunez.model.GestionEquipo;
import com.jsnunez.model.GestionJugador;
import com.jsnunez.model.GestionMediosComunicacion;
import com.jsnunez.model.GestionNoticias;
import com.jsnunez.model.GestionPartido;
import com.jsnunez.model.GestionPatrocineo;
import com.jsnunez.model.GestionPremios;
import com.jsnunez.model.GestionPublicidad;
import com.jsnunez.model.GestionRelaciones;
import com.jsnunez.model.GestionResultado;
import com.jsnunez.model.GestionTransferencias;
import com.jsnunez.model.GestionUsuarios;
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
    GestionMediosComunicacion.controlador = controlador;
    GestionTransferencias.controlador = controlador;
    GestionUsuarios.controlador = controlador;
    GestionEquipamento.controlador = controlador;
    GestionPremios.controlador = controlador;
    GestionPublicidad.controlador = controlador;
    GestionRelaciones.controlador = controlador;
    GestionAficionados.controlador = controlador;

    com.jsnunez.model.DatosInicio.start();
    Clc.clc();
    UsuarioInicioSesion usuarioSesion = null;
    String tipoUsuario = null;

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        // Portada p = new Portada();
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
            Clc.clc();
            if (tipoUsuario == "Administrador") {

              Clc.clc();
              GestionAdministrador.menu(sc);

            }
            if (tipoUsuario == "Aficionado") {
              int opcionAficionado = 0;
              do {

                opcionAficionado = ViewAficionados.start(sc);
                switch (opcionAficionado) {
                  case 1:

                    GestionAficionados.visualizacion(sc);

                    break;
                  case 2:
GestionVentas.start(sc);
                    break;
                  case 3:

                  

                    break;
                  case 4:
                    Cerrarsesion.start();
                    Clc.clc();
                    break;

                  default:
                    break;

                }
              } while (opcionAficionado != 4);
            }

            if (tipoUsuario == "Periodista") {

              int opcionPeriodista = 0;
              do {

                opcionPeriodista = ViewPeriodistas.start(sc);
                switch (opcionPeriodista) {
                  case 1:

                    GestionAficionados.visualizacion(sc);

                    break;
                  case 2:

                    ViewGestionNoticias vgn = new ViewGestionNoticias();
                    int opcionNoticias;
                    GestionNoticias gn = new GestionNoticias();

                    do {
                      opcionNoticias = ViewGestionNoticias.start(sc);
                      switch (opcionNoticias) {
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
                    } while (opcionNoticias != 6);

                    break;
                  case 3:

                    break;
                  case 4:

                    break;
                  case 5:
                    Cerrarsesion.start();
                    Clc.clc();
                    break;
                  default:
                    break;

                }
              } while (opcionPeriodista != 5);
            }

            if (tipoUsuario == "Equipo Técnico") {

              int opcionPeriodista = 0;
              do {

                opcionPeriodista = ViewEquiposTecnicos.start(sc);
                switch (opcionPeriodista) {
                  case 1:

                  GestionCompletaJugadores.star(sc);
                  break;
                  case 2:

                  

                    break;

                  case 3:

                  GestionCompletaEntrenadores.star(sc);
                  
                    break;
                  case 12:
                    Cerrarsesion.start();
                    Clc.clc();
                    break;

                  default:
                    break;

                }
              } while (opcionPeriodista != 12);

            }

            if (tipoUsuario == "Árbitro") {

              int opcionArbitro = 0;
              do {

                opcionArbitro = ViewArbitrosFirstOpcion.star(sc);
                switch (opcionArbitro) {
                  case 1:

                    GestionAficionados.visualizacion(sc);

                    break;
                  case 2:

                    break;
                  case 3:
                    Cerrarsesion.start();
                    Clc.clc();
                    break;

                  default:
                    break;

                }
              } while (opcionArbitro != 3);

            }

            if (tipoUsuario == "Médico del Equipo") {

              int opcionMedico = 0;
              do {

                opcionMedico = ViewMedicosDelEquipos.star(sc);
                switch (opcionMedico) {
                  case 1:

                    GestionAficionados.visualizacion(sc);

                    break;
                  case 2:

                    break;
                  case 3:
                    Cerrarsesion.start();
                    Clc.clc();
                    break;

                  default:
                    break;

                }
              } while (opcionMedico != 3);

            }

            // Salir del bucle si se llega a un caso de finalización

          }
        }
      }
    }

  }

}