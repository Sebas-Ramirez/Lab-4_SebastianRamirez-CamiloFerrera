package lab.pkg4_sebastianramirez.camiloferrera;

public abstract class Jugador {
    private String nombre, casa;
    private int añocurso, numuniforme;
    
    public Jugador() {
    }

    public Jugador(String nombre, String casa, int añocurso, int numuniforme) {
        this.nombre = nombre;
        this.casa = casa;
        this.añocurso = añocurso;
        this.numuniforme = numuniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getAñocurso() {
        return añocurso;
    }

    public void setAñocurso(int añocurso) {
        this.añocurso = añocurso;
    }

    public int getNumuniforme() {
        return numuniforme;
    }

    public void setNumuniforme(int numuniforme) {
        this.numuniforme = numuniforme;
    }
    public abstract double getVelocidad_inicial();
    public abstract double getAgilidad();
    public abstract double getFuerza();
    public abstract void setVelocidad_inicial(double velocidad);
    public abstract void setAgilidad(double agilidad);
    public abstract void setFuerza(double fuerza);
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", casa=" + casa + ", a\u00f1ocurso=" + añocurso + ", numuniforme=" + numuniforme + '}';
    }
    
}
