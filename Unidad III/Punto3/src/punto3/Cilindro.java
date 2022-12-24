package punto3;

/**
 *
 * @author Alonso
 */

public class Cilindro extends Circulo4{
    
    private double altura;
    
    //Constructor
    public Cilindro(){
        
    }
    
    public Cilindro(int valorX, int valorY, double valorRadio,
    double valorAltura){
        super(valorX, valorY, valorRadio);
        establecerAltura(valorAltura);
    }
    
    //Establecer Altura del Cilindro
    public void establecerAltura(double valorAltura){
        altura = (valorAltura <0.0 ? 0.0 : valorAltura);
    }
    
    //Obtener Altura Cilindro
    public double obtenerAltura(){
    return altura;    
    }
    
    //Sobreescribir el metodo obtenerArea de Circulo4 para calcular el
    //area del cilindro
    public double obtenerArea(){
        return 2 * super.obtenerArea() + obtenerCircunferencia() + obtenerAltura();
    }
    
    //Calcular volumen del cilindro
    public double obtenerVolumen(){
        return super.obtenerArea() * obtenerAltura();

    }

    //Devolver la representacion del String
    public String toString(){
        return super.toString() + "; Altura = " + obtenerAltura();
        
    }
    
    }