package circulo;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Alonso
 */

public class PruebaCirculo {
    public static void main(String[] args) {
    Circulo circulo = new Circulo (37, 43, 2.5); //Crea el objeto cirulo
    
    //Obtener las coordenadas x-y y radio iniciales del circulo
    String salida = "La coordenada X es: "+ circulo.obtenerX() +
            "\nLa coordenada Y es: "+ circulo.obtenerY() +
            "\nEl radio es: "+ circulo.obtenerRadio();
    
    circulo.establecerX(35);  //Establecer nuevas coordenadas y radio
    circulo.establecerY(20);
    circulo.establecerRadio(4.25);
    
    //Obtener la representacion String del nuevo valor del circulo
    salida += "\n\nLa nueva ubicacion y el radio del circulo son\n "+
            circulo.toString();
    
    //Da formato a los de punto flotante con 2 digitos de precio
    DecimalFormat dosDigitos = new DecimalFormat("0.000");
    
    //Obtener diametro del circulo
    salida += "\nEl diametro es: "+
    dosDigitos.format(circulo.obtenerDiametro());
    
    //Obtener la circunferencia del circulo
    salida += "\nLa circunferencia es: "+
    dosDigitos.format(circulo.obtenerCircunferencia());    
    
    //obtener el area del circulo
    salida+= "\nEl area es: " + dosDigitos.format(circulo.obtenerArea());
    
    JOptionPane.showMessageDialog(null, salida);
    System.exit (0);
    }
    
}
