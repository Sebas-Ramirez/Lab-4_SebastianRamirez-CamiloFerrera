package lab.pkg4_sebastianramirez.camiloferrera;
import java.util.ArrayList;
public class Equipo {
    private String casa;
    private int partidosganados, partidosperdidos;
    private double promedioagilidad, promvelocidad, promfuerza;
    Jugador capitan;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo(String casa, int partidosganados, int partidosperdidos) {
        this.casa = casa;
        this.partidosganados = partidosganados;
        this.partidosperdidos = partidosperdidos;
    }
    public Equipo(String casa, int partidosganados, int partidosperdidos, Jugador capitan) {
        this.casa = casa;
        this.partidosganados = partidosganados;
        this.partidosperdidos = partidosperdidos;
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
    public double getPromedioagilidad() {
        return promedioagilidad;
    }
    public double getPromvelocidad() {
        return promvelocidad;
    }
    public double getPromfuerza() {
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
    public void setPromedioagilidad() {
        double promedio=0;
        for (Jugador j : jugadores) {
            promedio += j.getAgilidad();
        }
        this.promedioagilidad = promedio/7.0;
    }
    public void setPromvelocidad() {
        double promedio=0;
        for (Jugador j : jugadores) {
            promedio += j.getVelocidad_inicial();
        }
        this.promvelocidad = promedio/7.0;
    }
    public void setPromfuerza() {
        double promedio=0;
        for (Jugador j : jugadores) {
            promedio += j.getFuerza();
        }
        this.promfuerza = promedio/7.0;
    }
    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "casa=" + casa + ", partidosganados=" + partidosganados + ", partidosperdidos=" + partidosperdidos + ", promedioagilidad=" + promedioagilidad + ", promvelocidad=" + promvelocidad + ", promfuerza=" + promfuerza + ", capitan=" + capitan + ", jugadores=" + jugadores + '}';
    }
    
    
}
