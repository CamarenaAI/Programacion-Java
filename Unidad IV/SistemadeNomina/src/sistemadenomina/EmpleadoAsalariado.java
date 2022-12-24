package sistemadenomina;

/**
 *
 * @author Alonso
 */

//Clase empleado asalariado
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

//Constructor
public EmpleadoAsalariado(String nombre, String apellido,
        String numeroSeguroSocial, double salario){
    super(nombre, apellido, numeroSeguroSocial);
establecerSalarioSemanal(salario);    
}

//Establecer salrio del empleado
public void establecerSalarioSemanal(double salario){
    salarioSemanal = salario < 0.0 ? 0.0 : salario;
}


//Devolver salario
public double obtenerSalarioSemanal(){
    return salarioSemanal;
}

//Calcular el pago del empleado asalariado
//Sobreescribir el metodo abstracto ingresos de empleado
public double ingresos(){
    return obtenerSalarioSemanal();
}

//Devolver la representacion String del objeto empleadoAsalariado
public String toString(){
    return "\nEmpleado Asalariado: " + super.toString();
}
}
