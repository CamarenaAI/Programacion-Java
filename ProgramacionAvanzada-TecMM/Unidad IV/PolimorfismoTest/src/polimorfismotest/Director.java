package polimorfismotest;

/**
 *
 * @author Alonso
 */

public class Director extends Empleado{
    double bono;
    
    public Director(){}
    
    public Director(String nom, String ced, int age, boolean stat,
                   double sal, double grat){
    nombre = nom;
    cedula = ced;
    edad = age;
    casado = stat;
    salario = sal;
    bono = grat;
    }
    
    public double calcularSalario(){
    return salario + bono;    
    }
    
    public String imprimirDatos(){
    return super.imprimirDatos() +
                 "\nSalario: " + calcularSalario() +
                 "\nBono: " + bono;
}
}