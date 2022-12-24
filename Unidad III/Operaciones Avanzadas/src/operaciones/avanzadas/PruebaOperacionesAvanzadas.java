package operaciones.avanzadas;

/**
 *
 * @author Alonso
 */

public class PruebaOperacionesAvanzadas {
    public static void main(String[] args) {
    OperacionesAvanzadas Op = new OperacionesAvanzadas(6,4);
  
    
   System.out.println(Op.printStates()); 
    OperacionesAvanzadas Op2 = new OperacionesAvanzadas(4,-6);
    System.out.println(Op2.printStates());
    }
    
}
