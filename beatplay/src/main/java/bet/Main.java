package bet;

import java.util.Scanner;

import com.jsnunez.View.*;


import com.jsnunez.model.*;

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
              int opcionAficionado = ViewAficionados.start(sc);
              switch (opcionAficionado) {
                case 1:
                  GestionAficionados.visualizacion(sc);

                  break;

                default:
                  break;
              }
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

            // Salir del bucle si se llega a un caso de finalización

          }
        }
      }
    }

  }

}