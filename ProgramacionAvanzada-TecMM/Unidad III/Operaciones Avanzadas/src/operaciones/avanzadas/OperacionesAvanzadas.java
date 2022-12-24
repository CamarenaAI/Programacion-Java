package operaciones.avanzadas;

/**
 *
 * @author Alonso
 */

public class OperacionesAvanzadas extends OperacionesBasicas{
    double Division;
    double Multiplicacion;

    public OperacionesAvanzadas(float newMult, float newDiv){
    num1 = newMult;
    num2 = newDiv;
    }
    double getMultiplicacion() {
    Multiplicacion = (num1 * num2);
        return Multiplicacion;
    }
    
    float getDivision() {
    Division = (num1 / num2);
        return (float) Division;
    }
    
 public String printStates(){
             return super.printStates() +
            "\nMultiplicacion: " + getMultiplicacion() +    "\nDivision: " + getDivision() + "\n";
}
    
    
}
