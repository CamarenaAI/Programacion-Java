package punto3;

/**
 *
 * @author Alonso
 */

public class Punto3 {
    private int x;
    private int y;
    
    //Constructor
    public Punto3(){
        
    }
    
    public Punto3(int valorX, int valorY){
    x = valorX;
    y = valorY;
    }
    
    public void establecerX(int valorX){
    x = valorX;
    }
    public int obtenerX(){
    return x;
    }
    public void establecerY(int valorY){
    y = valorY ;
}
    public int obtenerY(){
    return y;
    }
    public String toString(){
    return "[" + obtenerX() + "," + obtenerY() + "]";
    }
}
