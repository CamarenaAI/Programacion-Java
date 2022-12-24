package operaciones.avanzadas;

/**
 *
 * @author Alonso
 */

public class OperacionesBasicas {
    float num1;
    float num2;
    double Suma;
    double Resta;
    
    public OperacionesBasicas(){}
    public OperacionesBasicas(float newSuma,float newResta){
    num1 = newSuma;
    num2= newResta;
    }
    double getSuma() {
    Suma = (num1 + num2);
        return Suma;
    }
    
    double getResta(){
    Resta = (num1 - num2);    
        return Resta;
    }
    
 public String printStates(){
             return "Suma: " + getSuma() + "\nResta: " + getResta();
}
}
