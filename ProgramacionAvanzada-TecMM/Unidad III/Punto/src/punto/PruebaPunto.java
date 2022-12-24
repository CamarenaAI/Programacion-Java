package punto;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class PruebaPunto {
    public static void main(String[] args) {
    Punto punto = new Punto(72,115);
    Punto punto1 = new Punto();
    
    //Obtener cordenadas del Punto
    String salida = "La Coordenada X es: " + punto.obtenerX() +
    "\nLa Coordenada Y es " + punto.obtenerY();
    punto.establecerX(10); //Establecer coordenadas
    punto.establecerY(20);
    
    //Obtener las representacion string del nuevo vaor de punto
    
    salida += "n\nLa nueva ubicacion de punto es "+ punto;
    
    JOptionPane.showMessageDialog(null, salida); //Mostrar resultados
    System.exit(0);
    }
    
}
