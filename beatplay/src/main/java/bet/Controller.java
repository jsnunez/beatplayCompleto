package bet;

import java.util.Hashtable;

import com.jsnunez.model.Arbitro;
import com.jsnunez.model.Comunicacion;
import com.jsnunez.model.Entrada;
import com.jsnunez.model.Entrenadores;
import com.jsnunez.model.Entrenamiento;
import com.jsnunez.model.Gol;
import com.jsnunez.model.Incidente;
import com.jsnunez.model.Lesion;
import com.jsnunez.model.Player;
import com.jsnunez.model.Team;
import com.jsnunez.model.Transferencias;
import com.jsnunez.model.Usuario;
import com.jsnunez.model.estadio;
import com.jsnunez.model.rendimiento;
import com.jsnunez.model.Partido;
import com.jsnunez.model.Patrocinador;
import com.jsnunez.model.Permiso;
import com.jsnunez.model.Resultado;
import com.jsnunez.model.Rol;
import com.jsnunez.model.Tarjeta;

public class Controller {
    public Hashtable<String, Team> equipos = new Hashtable<>();
    public Hashtable<String, Player> jugadores = new Hashtable<>();
    public Hashtable<String, Usuario> usuarios = new Hashtable<>();
    public Hashtable<String, Comunicacion> comunicaciones = new Hashtable<>();
    public Hashtable<String, Entrada> entradas = new Hashtable<>();
    public Hashtable<String, Entrenamiento> entrenamientos = new Hashtable<>();
    public Hashtable<String, Gol> goles = new Hashtable<>();
    public Hashtable<String, Incidente> incidentes = new Hashtable<>();
    public Hashtable<String, Lesion> leisones = new Hashtable<>();
    public Hashtable<String, Partido> partidos = new Hashtable<>();
    public Hashtable<String, Patrocinador> patrocinadores = new Hashtable<>();
    public Hashtable<String, Permiso> permisos = new Hashtable<>();
    public Hashtable<String, Resultado> Resultados = new Hashtable<>();
    public Hashtable<String, Rol> roles = new Hashtable<>();
    public Hashtable<String, Tarjeta> tarjetas = new Hashtable<>();
    public Hashtable<String, Transferencias> transferencias = new Hashtable<>();
    public Hashtable<String, estadio> estadios = new Hashtable<>();
    public Hashtable<String, rendimiento> rendimientos = new Hashtable<>();
 
    public Hashtable<String, Entrenadores> entrenadores = new Hashtable<>();
    
    public Hashtable<String, Arbitro> arbitros = new Hashtable<>();

}
