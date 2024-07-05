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
import com.jsnunez.model.Clc;
import com.jsnunez.model.DatosInicio;
import com.jsnunez.model.GEstionEstadio;
import com.jsnunez.model.GestionAdministrador;
import com.jsnunez.model.GestionArbitro;
import com.jsnunez.model.GestionEntrenadores;
import com.jsnunez.model.GestionEquipo;
import com.jsnunez.model.GestionJugador;
import com.jsnunez.model.GestionMediosComunicacion;
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
    GestionMediosComunicacion.controlador = controlador;
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
            Clc.clc();
            if (tipoUsuario == "Administrador") {

              Casos c = new Casos();
              caso = c.start(tipoUsuario, sc);
              Clc.clc();
              GestionAdministrador.menu(sc, caso);
             
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

            // Salir del bucle si se llega a un caso de finalización

          }
        }
      }
    }

  }

}