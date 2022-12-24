package polimorfismotest;

/**
 *
 * @author Alonso
 */

public class Empleado {
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;
    String clasificacion;
    
    //Constructor
    public Empleado(){}
    
    public Empleado(String nom, String ced, int age, boolean stat, double sal, String clasif){
    nombre = nom;
    cedula = ced;
    edad = age;
    casado = stat;
    salario = sal;
    clasificacion = clasif;
    }
   
    //Clasificacion de Edad
    public String obtenerClasificacion(){
    if(edad<=21){clasificacion = "Principiante";}
    if(edad>21 && edad<=35){clasificacion = "Intermedio";}
    if(edad>35){clasificacion = "Senior";}
    return clasificacion;
    }
    
    public String imprimirDatos(){
    return "\nNombre: " + nombre
         + "\nCedula: " + cedula
         + "\nEdad: "   + edad
         + "\nEstado: " + casado
         + "\nSalario: " + salario
         + "\nClasifiacion: " + obtenerClasificacion();
    }
}
