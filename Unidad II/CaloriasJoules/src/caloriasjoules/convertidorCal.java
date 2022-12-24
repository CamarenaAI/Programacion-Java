package caloriasjoules;
import java.util.Scanner;
/**
 *
 * @author Alonso
 */

//1 cal = 4.8 Joules
public class convertidorCal {
    float Joules;
    float J = (float) 4.2;
    void caloriasAJoules(int newValue){ 
    Scanner r = new Scanner(System.in);  
     System.out.println("Ingrese las Calorias ");
     float C = r.nextFloat();
     
     Joules = (float) (4.2*C);
     System.out.println("Los Joules son: "+ Joules);
    }
}
