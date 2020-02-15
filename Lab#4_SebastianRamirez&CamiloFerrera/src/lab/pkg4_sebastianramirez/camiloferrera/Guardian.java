package lab.pkg4_sebastianramirez.camiloferrera;
public class Guardian extends Jugador{
    private double agilidad;
    
    public Guardian() {
        super();
    }

    public Guardian(double agilidad, String nombre, String casa, int añocurso, int numuniforme) {
        super(nombre, casa, añocurso, numuniforme);
        this.agilidad = agilidad+7;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
       this.agilidad = agilidad;
    }

    @Override
    public double getVelocidad_inicial() {
        return 0;
    }

    @Override
    public double getFuerza() {
        return 0;
    }

    @Override
    public void setVelocidad_inicial(double velocidad) {
        
    }

    @Override
    public void setFuerza(double fuerza) {
        
    }

    

    
    
            
}
