package polimorfismotest;

/**
 *
 * @author Alonso
 */

public class Profesor extends Empleado{
    int Materias;
    int horasSemana;
    String tipoProfesor;
    
    //Constructor
    public Profesor(){}
    
    public  Profesor(String nom, String ced, int age, boolean stat, double sal,
                    int subjects, int hours, String typeProfesor){
    nombre = nom;
    cedula = ced;
    edad = age;
    casado = stat;
    salario = sal;   
    Materias = subjects;
    horasSemana = hours;
    tipoProfesor = typeProfesor;    
    }
    
    public void calcularSalario(){
    if(salario == 72 * horasSemana){tipoProfesor = "Profesor A ";}
    if(salario == 92 * horasSemana){tipoProfesor = "Profesor B ";}
    if(salario == 110 * horasSemana){tipoProfesor = "Profesor C ";} 
    }
    
    public String imprimirDatos(){
    return super.imprimirDatos() +
                 "\nMaterias: " + Materias +
                 "\nHoras por Semana: " + horasSemana +
                 "\nTipo de Profesor: " + tipoProfesor;
    }
}
