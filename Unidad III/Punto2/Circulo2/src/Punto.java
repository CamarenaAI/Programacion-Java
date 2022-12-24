/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author HUSSIM
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        
    }
   public Punto(int x, int y){
       this.x = x;
       this.y = y;
   } 
    
   
   public void establecerX( int valorX){
       x = valorX;
   }
   public int obtenerX(){
       return x;
   }
   
   public void establecerY(int valorY){
       y = valorY;
   }
   
   public int obtenerY(){
       return y;
   }
   
   public String toString(){
       return "[" + x + ", " + y + "]";
   }
}
