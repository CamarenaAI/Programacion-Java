package punto2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Alonso
 */

public class PruebaCirculo3 {
    public static void main(String[] args) {
        
       // construtor 
       Circulo3 circulo;
       circulo = new Circulo3(37, 43, 2.5);
        
         //obtener las coordenadas x-y y radio iniciales del circulo
        String salida = " la coordenada X es " + circulo.obtenerX() + "\nLa coordenada Y es " + 
                circulo.obtenerY() + "\nEl radio es " + circulo.obtenerRadio();
        
        // establecer nuevas coordenadas y radio 
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.25);
        
        // obtener ña representacion String del nuevo valor del circulo+
        salida += "\n\nLa nueva ubicacion y el radio del circulo son\n" + 
                circulo.toString();
        
        // da formato a los valores de punto flotante con 2 digitales de precicio
        DecimalFormat dosDigitos = new DecimalFormat("0.000");
        
        //obtener el diametro del circulo 
        salida += "\nEl diametro es " +
                dosDigitos.format(circulo.obtenerDiametro());
        // obtener la circunferencia del circulo
        salida += "\nLa diametro es " +
                dosDigitos.format(circulo.obtenerCircunferencia());
        // obtener el area del circulo
        salida += "\nEl diametro es " +
                dosDigitos.format(circulo.obtenerArea());
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }

    }
    

