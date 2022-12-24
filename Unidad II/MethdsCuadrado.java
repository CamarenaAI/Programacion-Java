package Cuadrado;
import java.util.Scanner;
/**
 *
 * @author Alonso
 */

public class MethdsCuadrado {
    float Forma; 
    void Area(int newValue) {
    Scanner r = new Scanner(System.in);  
     System.out.println("Ingrese A ");
     float A = r.nextFloat();
     System.out.println("Ingrese B ");
     float B = r.nextFloat();
     System.out.println("Ingrese C ");
     float C = r.nextFloat();

     
     Forma = (B*B)-4*(A*C);
     System.out.println("El Area es: "+ Forma);
    }
}
