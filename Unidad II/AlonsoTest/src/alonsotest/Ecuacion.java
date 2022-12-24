package alonsotest;

/**
 *
 * @author Alonso
 */

public class Ecuacion {
     float Distancia; 
     
    double Ecuacion(float X1, float X2,float Y1,float Y2){    
     Distancia = (float) Math.sqrt(((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1)));
         return Distancia;
     }
}
