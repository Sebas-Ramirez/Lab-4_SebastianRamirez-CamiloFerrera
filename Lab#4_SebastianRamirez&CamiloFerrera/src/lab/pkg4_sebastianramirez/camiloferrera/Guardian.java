package lab.pkg4_sebastianramirez.camiloferrera;
public class Guardian extends Jugador{
    private double velocidad_inicial;
    
    public Guardian() {
        super();
    }
    
    public Guardian(double peso){
        setVelocidad_inicial(peso);
    }
    
    public double getVelocidad_inicial() {
        return velocidad_inicial;
    }

    public void setVelocidad_inicial(double peso) {
        this.velocidad_inicial = (200/peso)*7;
    }
    
}
