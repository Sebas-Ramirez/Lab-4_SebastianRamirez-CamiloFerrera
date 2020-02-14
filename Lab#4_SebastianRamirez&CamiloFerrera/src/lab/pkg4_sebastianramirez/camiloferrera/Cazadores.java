package lab.pkg4_sebastianramirez.camiloferrera;
public class Cazadores {
    private double velocidad_inicial,agilidad;

    public Cazadores() {
        super();
    }

    public Cazadores(double velocidad_inicial, double agilidad) {
        this.velocidad_inicial = velocidad_inicial;
        this.agilidad = agilidad;
    }

    public double getVelocidad_inicial() {
        return velocidad_inicial;
    }

    public void setVelocidad_inicial(double velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }
    
}
