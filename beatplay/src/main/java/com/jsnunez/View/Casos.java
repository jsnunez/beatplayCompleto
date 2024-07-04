package com.jsnunez.View;

import java.util.Scanner;

import com.jsnunez.model.Clc;

public class Casos {

    public static int start(String casos, Scanner sc) {
        int casoUsar;
        if (casos == null) {

        }

        if (casos == "Administrador") {
            Clc.clc();

System.out.println("INICIASTE SESION COMO ADMINISTRTADOR SELECCIONA LA OPCION DESEADA");
System.out.println();
            String[] items = {
                    "1. Gestión de Equipos",
                    "2. Gestión de Jugadores",
                    "3. Programación de Partidos",
                    "4. Registro de Resultados",
                    "5. Gestión de Noticias y Comunicados",
                    "6. Gestión de Entrenadores",
                    "7. Gestión de Árbitros",
                    "8. Gestión de Estadios",
                    "9. Gestión de Patrocinios",
                    "10. Generación de Informes",
                    "11. Gestión de Incidentes y Sanciones",
                    "12. Gestión de Medios de Comunicación",
                    "13. Gestión de Transferencias de Jugadores",
                    "14. Gestión de Equipamiento",
                    "15. Gestión de Premios y Reconocimientos",
                    "16. Gestión de Usuarios y Roles",
                    "17. Gestión de Patrocinadores y Publicidad",
                    "18. Gestión de Relaciones Públicas",
                    "19.Salir"
            };

            for (String item : items) {
                System.out.println(item);
            }
            
        }
      
        return casoUsar = sc.nextInt();

    }
}