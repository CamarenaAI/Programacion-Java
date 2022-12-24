/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUSSIM
 */
public class Circulo2 extends Punto{
    private double radio;
    // construtor
    public Circulo2(){
    
}
    public Circulo2(int valorX, int valorY, double valorRadio){
    x = valorX;  // no se puede porque es privado no ereda 
    y = valorY;
    establecerRadio(valorRadio);
    
}
    // establecer radio 
public void establecerRadio(double valorRadio){
    radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
}

// devuleve el valor de radio 
public double obtenerRadio(){
    return radio;
}

// calcula y devuelve el diametro 
public double obtenerDiametro(){
    return 2*radio;
}

// calcula y devuelve la circunferencia 
public double obtenerCircunferencia(){
    return Math.PI * obtenerDiametro();
}

// calcula y devuelve el area 
public double obtenerArea(){
    return Math.PI*radio*radio;
}

// devuelve represemtacion string del objetivo circulo
public String toString(){
    return "Centro = [" + x + ", " + y + " ]; Radio = " + radio;
}
}
