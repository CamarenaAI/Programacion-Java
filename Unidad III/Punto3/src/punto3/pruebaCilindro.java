package punto3;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class pruebaCilindro {
    public static void main(String[] args) {
    Cilindro cilindro = new Cilindro(12, 23, 2.5, 5.7);
    //Obtener las coordenadas x-y, radio y altura iniciales
    String salida = "La coordenada X es " + cilindro.obtenerX() +
    "\nLa coordenada Y es " + cilindro.obtenerY() + "\nEl radio es " +
    cilindro.obtenerRadio() + "\nLa altura es " + cilindro.obtenerAltura();
    
    cilindro.establecerX(35);
    cilindro.establecerY(20);
    cilindro.establecerRadio(4.25); //Nuevas Coordenadas
    cilindro.establecerAltura(10.75);
    
    //Obtener la representacion String
    salida += "\nLa nueva ubicacion, radio y altura del cilindro son\n" +
    cilindro.toString();
    
    //Dar formato los valores de punto flotante
    DecimalFormat dosDigitos = new DecimalFormat("0.00");
    
    //Obtener el diametro del cilindro
    salida += "\n\nEl diametro es " +
    dosDigitos.format(cilindro.obtenerDiametro());
    
    //Obtener la circunferencia del cilindro
    salida += "\nLa circunferncia es " +
    dosDigitos.format(cilindro.obtenerCircunferencia());
    
    //Obetener el area del Cilindro
    salida += "\nEl area es " + dosDigitos.format(cilindro.obtenerArea());
    
    //Obtener el Volumen del Cilindro
    salida += "\nEl volummen es " + dosDigitos.format(cilindro.obtenerVolumen());
    JOptionPane.showMessageDialog(null, salida);
    System.exit(0);
    }        
}
