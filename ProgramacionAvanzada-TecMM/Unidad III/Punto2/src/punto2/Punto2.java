package punto2;

/**
 *
 * @author Alonso
 */

public class Punto2 {
    protected int x; // coordenadas
    protected int y;
    
    // contructor 
    public Punto2(){
       
    }
    
    // constructor 
    public Punto2(int valorX, int valorY){
       x = valorX;
       y = valorY;
    }
    // establecer x
     public void establecerX( int valorX){
       x = valorX;
   }
     // devolver x del par de coordenadas 
   public int obtenerX(){
       return x;
   }
   // establecer Y 
   public void establecerY(int valorY){
       y = valorY;
   }
   // establecer Y del par de coordenadas 
   public int obtenerY(){
       return y;
   }
   
   public String toString(){
       return "[" + x + ", " + y + "]";
   }
}
