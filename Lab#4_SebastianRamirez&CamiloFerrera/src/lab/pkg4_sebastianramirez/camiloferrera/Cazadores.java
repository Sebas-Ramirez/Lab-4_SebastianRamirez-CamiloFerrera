package lab.pkg4_sebastianramirez.camiloferrera;
public class Cazadores extends Jugador {
    private double velocidad_inicial,agilidad;

    public Cazadores() {
        super();
    }

    public Cazadores(double peso, double reflejos, String nombre, String casa, int añocurso, int numuniforme) {
        super(nombre, casa, añocurso, numuniforme);
        this.velocidad_inicial = (200/peso)*7;
        this.agilidad = reflejos+7;
    }
    
    public Cazadores(double peso, double reflejos) {
        this.velocidad_inicial = (200/peso)*7;
        this.agilidad = reflejos+7;
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

    @Override
    public double getFuerza() {
        return 0;
    }

    @Override
    public void setFuerza(double fuerza) {
        
    }

    
    
}
