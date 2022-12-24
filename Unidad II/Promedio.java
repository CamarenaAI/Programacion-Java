package promedio;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class Promedio {
    public static void main(String[] args) {

     int Promedio;
     int Calificacion;
     int ContadorCalif;        
     int Total;
     
     String cadenaCalif;
     
     Total = 0;
     ContadorCalif = 1;
    
     while(ContadorCalif<=10){
         cadenaCalif = JOptionPane.showInputDialog("Escriba la calificacion como un entero ");
         Calificacion = Integer.parseInt(cadenaCalif);
         Total = Total + Calificacion;
         ContadorCalif = ContadorCalif + 1;
     }    
     Promedio = Total/10;
     JOptionPane.showMessageDialog(null, "El Promedio de la clase es " + Promedio, "Promedio de la clase",
                                  JOptionPane.INFORMATION_MESSAGE); 
     System.exit(0);
}
}