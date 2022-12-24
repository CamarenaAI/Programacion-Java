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
public class Circulo2 extends Puntito{
    private double radio;
    
    public Circulo2(){
        
    }
    public Circulo2(int valorX, int valorY, double valorRadio){
        x = valorX;
        y = valorY;
        establecerRadio(valorRadio);
    }
    public void establecerRadio(double valorRadio){
        radio =(valorRadio < 0.0 ? 0.0 : valorRadio);
    }
    public double obtenerRadio(){
        return radio;
    } 
    public double obtenerDiametro(){
        return 2 * radio;
    } 
    public double obtenerCircunferencia(){
        return Math.PI * obtenerDiametro();
    }    
    public double obtenerArea(){
        return Math.PI * radio * radio;
    }
    public String toString(){
         return "centro = [" + x + "," + y + "  ]; Radio = " + radio;
    }
}
