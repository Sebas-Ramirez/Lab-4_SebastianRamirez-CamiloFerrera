package lab.pkg4_sebastianramirez.camiloferrera;
public class Buscador extends Jugador  {
    private double velocidad_inicial;

    public Buscador() {
    }

    public Buscador(double peso) {
        this.velocidad_inicial = (200/peso)*7;
    }

    public Buscador(double peso, String nombre, String casa, int añocurso, int numuniforme) {
        super(nombre, casa, añocurso, numuniforme);
        this.velocidad_inicial = (200/peso)*7;
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

    @Override
    public void setAgilidad(double agilidad) {
        
    }

    @Override
    public void setFuerza(double fuerza) {
        
    }


    
    
}
