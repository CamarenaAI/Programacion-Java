package punto2;


/**
 *
 * @author Alonso
 */

public class Circulo3 extends Punto2{
    
    private double radio;
    //construtor 
    public Circulo3(){
        
    }
    public Circulo3(int valorX, int valorY, double valorRadio){
    x = valorX;
    y = valorY;
    establecerRadio(valorRadio);
}

// establecer X  en el par de coordenadas 
public void establecerX(int valorX){
    x = valorX;
}
// devuelve el valor de x
public int obtenerX(){
    return x;
}

// establecer y en el par de coordenadas 
public void establecerY(int valorY){
    y = valorY;
}

// devuelve el valor de y
public int obtenerY(){
    return y;
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
