package lab.pkg4_sebastianramirez.camiloferrera;
import java.util.ArrayList;
public class Equipo {
    String casa;
    int partidosganados, partidosperdidos, promedioagilidad, promvelocidad, promfuerza;
    Jugador capitan;
    ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo(String casa, int partidosganados, int partidosperdidos, Jugador capitan) {
        this.casa = casa;
        this.partidosganados = partidosganados;
        this.partidosperdidos = partidosperdidos;
        this.capitan = capitan;
    }
    public Equipo(String casa, int partidosganados, int partidosperdidos, int promedioagilidad, int promvelocidad, int promfuerza, Jugador capitan) {
        this.casa = casa;
        this.partidosganados = partidosganados;
        this.partidosperdidos = partidosperdidos;
        this.promedioagilidad = promedioagilidad;
        this.promvelocidad = promvelocidad;
        this.promfuerza = promfuerza;
        this.capitan = capitan;
    }
    public Equipo() {
    }

    public String getCasa() {
        return casa;
    }
    public int getPartidosganados() {
        return partidosganados;
    }
    public int getPartidosperdidos() {
        return partidosperdidos;
    }
    public int getPromedioagilidad() {
        return promedioagilidad;
    }
    public int getPromvelocidad() {
        return promvelocidad;
    }
    public int getPromfuerza() {
        return promfuerza;
    }
    public Jugador getCapitan() {
        return capitan;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
    public void setPartidosganados(int partidosganados) {
        this.partidosganados = partidosganados;
    }
    public void setPartidosperdidos(int partidosperdidos) {
        this.partidosperdidos = partidosperdidos;
    }
    public void setPromedioagilidad(int promedioagilidad) {
        this.promedioagilidad = promedioagilidad;
    }
    public void setPromvelocidad(int promvelocidad) {
        this.promvelocidad = promvelocidad;
    }
    public void setPromfuerza(int promfuerza) {
        this.promfuerza = promfuerza;
    }
    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
