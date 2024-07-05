package com.jsnunez.model;

import java.util.Scanner;

import com.jsnunez.View.Casos;
import com.jsnunez.View.ViewArbitros;
import com.jsnunez.View.ViewEquipamento;
import com.jsnunez.View.ViewEstadios;
import com.jsnunez.View.ViewGestionEntrenadores;
import com.jsnunez.View.ViewGestionEquipos;
import com.jsnunez.View.ViewGestionJugadores;
import com.jsnunez.View.ViewGestionNoticias;
import com.jsnunez.View.ViewGestionPartidos;
import com.jsnunez.View.ViewGestionResultado;
import com.jsnunez.View.ViewGestionTransferencias;
import com.jsnunez.View.ViewGestionmedioC;
import com.jsnunez.View.ViewPatrocinios;
import com.jsnunez.View.ViewPremios;
import com.jsnunez.View.ViewPublicidad;
import com.jsnunez.View.ViewUsuarios;
import com.jsnunez.model.GestionEntrenadores.controlador;

public class GestionAdministrador {

  public static void menu(Scanner sc) {
   int caso =0;
    do {
      caso = Casos.start("Administrador", sc);
      Clc.clc();
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
                gune.ListarEquipos();
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
                break;
              case 4:
                gunj.ListarJugadores();
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
                break;
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
              System.out.println("Seleccione una opcion validad");
              break;
          }

          break;

        case 12:
          int opcionGestionmedios = ViewGestionmedioC.start(sc);
          do {

            switch (opcionGestionmedios) {

              case 1:
                GestionMediosComunicacion.CrearMedio(sc);
                System.out.println("enter para continuar");
                sc.nextLine();
                opcionGestionmedios = ViewGestionmedioC.start(sc);
                break;
              case 2:
                GestionMediosComunicacion.EditarMedio(sc);
                System.out.println("enter para continuar");
                sc.nextLine();
                opcionGestionmedios = ViewGestionmedioC.start(sc);
                break;
              case 3:
                GestionMediosComunicacion.EliminarMedio(sc);
                System.out.println("enter para continuar");
                sc.nextLine();
                opcionGestionmedios = ViewGestionmedioC.start(sc);
                break;
              case 4:
                GestionMediosComunicacion.ListarMedio();
                System.out.println("enter para continuar");
                sc.nextLine();
                opcionGestionmedios = ViewGestionmedioC.start(sc);
                break;
              case 5:

                break;
              default:
                System.out.println("Seleccione una opcion validad");
                opcionGestionmedios = ViewGestionmedioC.start(sc);

            }
          } while (opcionGestionmedios != 5);

          break;
        case 13:
          int opcion = 1;
          do {
            ViewGestionTransferencias.star();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
              case 1:
                GestionTransferencias.Transferencia(sc);
                break;
              case 2:

                break;
              case 3:

                break;
              case 4:

                break;

              default:
                System.out.println("seleccione un valor valido");
                break;
            }
          } while (opcion != 4);

          break;

        case 14:
          int opcionequipamento = 1;
          do {
            ViewEquipamento.star();
            opcionequipamento = sc.nextInt();
            sc.nextLine();
            switch (opcionequipamento) {
              case 1:
                GestionEquipamento.CrearEquipamento(sc);
                break;
              case 2:

                break;
              case 3:

                break;
              case 4:

                break;
              case 5:

                break;
              default:
                break;
            }

          } while (opcionequipamento != 5);

          break;

        case 15:
          int opcionpremios = 1;
          do {
            Clc.clc();

            ViewPremios.star();
            opcionpremios = sc.nextInt();
            sc.nextLine();
            switch (opcionpremios) {
              case 1:

                GestionPremios.CrearPremio(sc);
                break;
              case 2:

                GestionPremios.CrearPremio(sc);
                break;
              case 3:

                GestionPremios.CrearPremio(sc);
                break;
              case 4:

                break;
              default:
                break;
            }
          } while (opcionpremios != 4);
        case 16:
          int opcionusurio = 1;
          do {

            ViewUsuarios.star();
            opcionusurio = sc.nextInt();
            sc.nextLine();
            switch (opcionusurio) {
              case 1:
                GestionUsuarios.CrearUsuarios(sc);
                break;
              case 2:

                break;
              case 3:

                break;
              case 4:

                break;
              case 5:

                break;
              default:
                break;
            }

          } while (opcionusurio != 5);
          break;
        case 17:

          int opcionPublicidad = 0;
          do {

            ViewPublicidad.star();
            opcionPublicidad = sc.nextInt();
            sc.nextLine();
            switch (opcionPublicidad) {
              case 1:
              GestionPublicidad.CrearPatrocinador(sc);                break;
              case 2:

                break;
              case 3:

                break;
              case 4:

                break;
              case 5:

                break;
              default:
                break;
            }
           
        

          } while (opcionPublicidad != 5);
       
        case 18:

        int opcionRelaciones = 0;
        do {

          ViewPublicidad.star();
          opcionRelaciones = sc.nextInt();
          sc.nextLine();
          switch (opcionRelaciones) {
            case 1:
            GestionRelaciones.CrearRelaciones(sc);
            break;
            case 2:

              break;
            case 3:

              break;
            case 4:

              break;
            case 5:

              break;
            default:
              break;
          }
         
      

        } while (opcionRelaciones != 5);
        case 19:
   
          
     
System.out.println("Vuelve pronto");
      System.out.println("Cerrando sesion");
      for (int i = 0; i < 50; i++) {
          System.out.print(".");
          try {
              Thread.sleep(5 * 5);
          } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }

      }
      Clc.clc();

          break;

        default:
        

          System.out.println("Opcion no valida");
          System.out.println("Ingrese una opcion valida o oprima 19 para salir");

          sc.nextLine();
          break;
      }

     
    } while (caso != 19);

  }

}