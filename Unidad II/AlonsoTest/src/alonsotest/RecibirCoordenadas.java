package alonsotest;
import java.util.Scanner;

/**
 *
 * @author Alonso
 */

public class RecibirCoordenadas {
    float X1, X2, Y1, Y2;     
    
    float X1() {
    Scanner r = new Scanner(System.in);  
     System.out.println("Ingrese la cordenada en X1 ");
     X1 = r.nextFloat();
     return X1;
    }
    
     float X2() { 
    Scanner r = new Scanner(System.in);
     System.out.println("Ingrese la cordenada en X2 ");
     X2 = r.nextFloat();     
     return X2;
    }
     
     float Y1() {
    Scanner r = new Scanner(System.in);    
     System.out.println("Ingrese la cordenada en Y1 ");
     Y1 = r.nextFloat();
     return Y1;    
     }
     
     float Y2(){
    Scanner r = new Scanner(System.in);     
     System.out.println("Ingrese la cordenada en Y2 ");
     Y2 = r.nextFloat();
     return Y2;
     }       
}