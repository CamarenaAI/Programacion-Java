package polimorfismotest;

/**
 *
 * @author Alonso
 */

public class Programador extends Empleado{
    int LineasDeCoidogPorHora;
    String lenguajeDominante;

//Constructor
    public Programador(){}

    public Programador(String nom, String ced, int age, boolean stat, 
                       double sal, int cod, String lenguaje){
    nombre = nom;
    cedula = ced;
    edad = age;
    casado = stat;
    salario = sal;
    LineasDeCoidogPorHora = cod;
    lenguajeDominante = lenguaje;    
    }

    void calcularSalario(){
    salario = 320 * LineasDeCoidogPorHora;
    }
    
    public String imprimirDatos(){
    return super.imprimirDatos() +
                 "\nSalario: " + salario +
                 "\nLenguaje de Programacion: " + lenguajeDominante;
    }
}