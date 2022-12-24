package circulo;

/**
 *
 * @author Alonso
 */

public class Circulo {
     private int x; //Coordenadas X en el centro del radio
     private int y; //Coordenadas Y en el centro del radio
     private double radio; //Radio del circulo
     
     //Constructor
     public Circulo(){
         
     }
     
 public Circulo(int x, int y, double valorRadio){
     this.x = x;
     this.y = y;
     establecerRadio(valorRadio);
 }

 //Establecer X en el par de coordenadas 
 public void establecerX(int valorX){
     x = valorX;
 }
 
 //devuelve el valor X en el par de coordenadas
 public int obtenerX(){
     return x;
 }
 
 //Establecer Y en el par de coordenadas
 public void establecerY(int valorY){
     y = valorY;
 }
 
 //Devuelve el valor Y en el par de coordenadas
 public int obtenerY(){
     return y;
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
     return 2 * radio;
 } 
 
 //Calcula y devuelve la circunferencia
  public double obtenerCircunferencia(){
  return Math.PI * obtenerDiametro();
} 
 
 //Calcula y devuelve el area 
  public double obtenerArea(){
  return Math.PI * radio * radio;
}
  
//Devuelve la epresentacion String del objeto circulo
  public String toString(){
      return "Centro = [" + x +", " + y +", ]; Radio = " + radio;
  }
  
}
