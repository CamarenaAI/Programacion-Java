package triangulo;
import java.util.Scanner;

/**
 *
 * @author Alonso
 */

public class MethdsTriangulo {
    float Area;
    float Perimetro;
    
//Metodos
    void Area(int newValue) {
    Scanner r = new Scanner(System.in);  
     System.out.println("Ingrese la Base ");
     float Base = r.nextFloat();
     System.out.println("Ingrese la Altura ");
     float Alt = r.nextFloat();
     
     Area = (Base*Alt)/2;
     System.out.println("El Area es: "+ Area);
    }
    
    void Perimetro(int newValue) {
    Scanner r = new Scanner(System.in);          
     System.out.println("Ingrese el Lado 1 ");
     float L1 = r.nextFloat();
     System.out.println("Ingrese el Lado 2 ");
     float L2 = r.nextFloat();
     System.out.println("Ingrese el Lado 3 ");
     float L3 = r.nextFloat();     
     Perimetro = L1+L2+L3;
     System.out.println("El Perimetro es: "+ Perimetro);     
    }
}
