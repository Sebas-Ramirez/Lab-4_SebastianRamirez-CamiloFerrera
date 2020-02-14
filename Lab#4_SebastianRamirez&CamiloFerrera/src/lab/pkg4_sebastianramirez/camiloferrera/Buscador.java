package lab.pkg4_sebastianramirez.camiloferrera;
public class Buscador extends Jugador  {
    private double velocidad_inicial;

    public Buscador() {
    }

    public Buscador(double velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    public double getVelocidad_inicial() {
        return velocidad_inicial;
    }

    public void setVelocidad_inicial(double velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    @Override
    public double getAgilidad() {
        return 0;
    }

    @Override
    public double getFuerza() {
        return 0;
    }
    
}
