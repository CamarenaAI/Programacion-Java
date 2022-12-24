package promedio2;

import java.util.Scanner;

/**
 *
 * @author alonso
 */
public class capturaDatos {
    Void capturaDatos(int newValue){
        float Acum = 1;                                      //Acumular
        float Notas = 0;
        Scanner r = new Scanner(System.in); 
        System.out.println("¿Ingrese las notas a Promediar?");
        float cn = r.nextFloat();                            //Cantidad de Notas
     
     while(Acum <= cn){
        System.out.println("Ingrese las notas ");
        float n = r.nextFloat();
        Notas += n;
        Acum ++;
        
     }
             
             
     float Promedio = Notas / cn;
     System.out.println("El promedio es: "+ Promedio);   
     return null;
    }
}
