package excepciones;

/**
 *
 * @author Alonso
 */

public class Excepciones {
    public static void main(String[] args) {
    
    int ar[] = {1,2,3,4,5};

    try{
     for (int i=0; i<=ar.length; i++){
     System.out.println(ar[i]);
    }
    }
    
    catch(Exception excepcion){
    System.out.println("El programa finalizo con exito");
    System.out.println("Error corregido: java.lang.ArrayIndexOutOfBoundsException: 5");
}    
}
}