package shapes;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class Shapes {

    public static void main(String[] args) {     
        Circle Circle1 = new Circle(20, "Green", true);
        Rectangle Rectangle1 = new Rectangle(30,45,"Green",true);
        Square Square1 = new Square(69,"Green",true);
        String salida = "Circulo, " +
                        Circle1.toString()+
                        "\nEl Color es " + Circle1.getColor() +
                        "\nFilled es " + Circle1.isFilled() +
                      
                      "\n\nRectangulo, " +
                        Rectangle1.toString() +
                        "\nEl Color es " + Rectangle1.getColor() +
                        "\nEl Filled es " + Rectangle1.isFilled() +
                
                      "\n\nCuadrado, " +
                       Square1.toString();

        Circle1.setRadius(13);
        Circle1.setColor("Blue");
        Circle1.setFilled(false);
        
        Rectangle1.setWidth(12);
        Rectangle1.setLength(25);
        Rectangle1.setColor("White");
        Rectangle1.setFilled(false);
        
        Square1.setSide(18);    
        Square1.setColor("Yellow");
        Square1.setFilled(false);
        
        salida += "\nLos nuevos datos del circulo son \n" + Circle1.toString() + 
                  "\n\nLos nuevos datos del rectangulo son \n" + Rectangle1.toString() +
                  "\n\nLos nuevos datos del cuadrado son \n" + Square1.toString();
        
        
        //Dar formato a los valores de punto flotante
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        
        //Obtener el area y perímetro del circulo
        salida += "\n\nCircle" +
                    "\nEl color es " + Circle1.getColor() +
                    "\nEl relleno es " + Circle1.isFilled() +
                    "\nEl area es " + dosDigitos.format(Circle1.getArea()) +
                    "\nLa circunferencia es de " + dosDigitos.format(Circle1.getPerimeter()) +
                            
                  "\n\nRectangle" +
                    "\nEl color es " + Rectangle1.getColor() +
                    "\nEl relleno es " + Rectangle1.isFilled() +                    
                    "\nEl area es " + dosDigitos.format(Rectangle1.getArea()) +
                    "\nEl perímetro es de " + dosDigitos.format(Rectangle1.getPerimeter()) +
                  
                  "\n\nSquare" +
                    "\nEl color es " + Square1.getColor() +
                    "\nEl relleno es " + Square1.isFilled() +
                    "\nEl area es " + dosDigitos.format(Square1.getArea()) +
                    "\nEl perímetro es de " + dosDigitos.format(Square1.getPerimeter());
                    
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    } 
}
