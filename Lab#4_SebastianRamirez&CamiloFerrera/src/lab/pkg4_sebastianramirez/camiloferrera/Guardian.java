package lab.pkg4_sebastianramirez.camiloferrera;
public class Guardian extends Jugador{
    private double agilidad;
    
    public Guardian() {
        super();
    }

    public Guardian(double reflejos) {
        setAgilidad(reflejos);
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

    @Override
    public double getFuerza() {
        return 0;
    }
    
            
}
