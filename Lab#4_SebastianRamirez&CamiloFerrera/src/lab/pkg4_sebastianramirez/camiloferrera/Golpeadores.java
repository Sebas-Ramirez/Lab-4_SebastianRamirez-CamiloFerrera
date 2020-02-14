package lab.pkg4_sebastianramirez.camiloferrera;
public class Golpeadores extends Jugador{
    private double fuerza,agilidad;

    public Golpeadores() {
        super();
    }

    public Golpeadores(double musculatura , double reflejos) {
        setAgilidad(reflejos);
        setFuerza(musculatura);
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double musculatura) {
        this.fuerza = (musculatura*2)-7;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double reflejos) {
        this.agilidad = reflejos+7;
    }

    @Override
    public double getVelocidad_inicial() {
        return 0;
    }
    
}
