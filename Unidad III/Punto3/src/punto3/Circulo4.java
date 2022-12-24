package punto3;


/**
 *
 * @author Alonso
 */

public class Circulo4 extends Punto3{
    private double radio;
    
    //Constructor
    public Circulo4(){
        
    }    
    
    public Circulo4(int valorX, int valorY, double valorRadio){
     super(valorX, valorY);
     establecerRadio(valorRadio);
    }

 //Establecer el radio
 public void establecerRadio(double valorRadio){
     radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
 }
 
 //Establecer el valor del radio
 public double obtenerRadio(){
     return radio;
 }
 
 //Calcula y devuelve el diametro
 public double obtenerDiametro(){
     return 2 * obtenerRadio();
 } 
 
 //Calcula y devuelve la circunferencia
  public double obtenerCircunferencia(){
  return Math.PI * obtenerDiametro();
} 
 
 //Calcula y devuelve el area 
  public double obtenerArea(){
  return Math.PI * obtenerRadio() * obtenerRadio();
}
  
//Devuelve la epresentacion String del objeto circulo
  public String toString(){
      return "Centro = " + super.toString() + "; Radio = "+ obtenerRadio();
  }
}
