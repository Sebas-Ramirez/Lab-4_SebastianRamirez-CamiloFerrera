package lab.pkg4_sebastianramirez.camiloferrera;
public class Excepcion extends Exception{

    public Excepcion() {
        super();
    }
    public void Casa(int num)throws Exception{
        if(num>5||num<0)
            throw new Exception();
    }
    
}
