package punto;

/**
 *
 * @author Alonso
 */

public class Punto {
    private int x;
    private int y;
    public Punto(){}
    
    public Punto(int x, int y){
    this.x=x;
    this.y=y;
    }
    public void establecerX(int valorX){
    x=valorX;
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
    return "[" + x + "," + y + "]";
    }
}
