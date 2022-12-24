package alonsotest;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class Imprimir {
    void Imprimir(double v){
            System.out.println("El resultado es " + v);
    }
    void Imprimir2(double b){
    JOptionPane.showMessageDialog(null, "El Resultado es " + b, "Resultado",    JOptionPane.INFORMATION_MESSAGE); 

    }
}
