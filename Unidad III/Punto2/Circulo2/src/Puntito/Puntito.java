/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntito;
/**
 *
 * @author llim7
 */
public class Puntito {
    int x;
    int y;
    
    public Puntito(int x, int y){
        this.x = x;
        this.y = y;
    }

    Puntito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void establecerX(int valorX){
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
    
    //devuelve la representacion string del objeto puntito
    public String toString(){
        return "[" + x + "," + y + "]";
    }
}

