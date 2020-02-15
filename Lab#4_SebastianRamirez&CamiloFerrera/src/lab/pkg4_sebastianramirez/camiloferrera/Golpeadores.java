package lab.pkg4_sebastianramirez.camiloferrera;
public class Golpeadores extends Jugador{
    private double fuerza,agilidad;

    public Golpeadores() {
        super();
    }

    public Golpeadores(double musculatura, double reflejos, String nombre, String casa, int añocurso, int numuniforme) {
        super(nombre, casa, añocurso, numuniforme);
        this.fuerza = (musculatura*2)-7;
        this.agilidad = reflejos+7;;
    }
    
    
    public Golpeadores(double musculatura , double reflejos) {
        this.fuerza = (musculatura*2)-7;
        this.agilidad = reflejos+7;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double reflejos) {
        this.agilidad = agilidad;
    }

    @Override
    public double getVelocidad_inicial() {
        return 0;
    }

    @Override
    public void setVelocidad_inicial(double velocidad) {
        
    }

    
    
}
