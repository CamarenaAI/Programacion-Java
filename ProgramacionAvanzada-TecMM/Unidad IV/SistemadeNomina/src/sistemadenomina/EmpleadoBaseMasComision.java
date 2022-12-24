package sistemadenomina;

/**
 *
 * @author Alonso
 */

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    //Constructor
    public EmpleadoBaseMasComision(String nombre, String apellido,
            String numeroSeguroSocial,
            double cantidadVentasTotales, double tasa,
            double cantidadSalarioBase){
        super(nombre, apellido, numeroSeguroSocial, cantidadVentasTotales, tasa);
        establecerSalarioBase(cantidadSalarioBase); 
    }
    
    //Establecer el salario base del empleado
    public void establecerSalarioBase(double salario){
        salarioBase = salario < 0.0 ? 0.0 : salario;
    }
    
    //Devolver el salario base del empleado con salario base mas comision
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    //Calcular los ingresos del empleado con salario base mas comision
    //Sobreescribir el metodo de ingresos en EMpleadoPorComision
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }

    //Devolver la representacion String del objeto
    public String toString(){
        return "\nEmpleado con salario base mas comision: " +
                super.obtenerPrimerNombre()
                + " "
                + super.obtenerApellidoPaterno() + "\nNumero de Seguro Social: " +
                super.obtenerNumeroSeguroSocial();
    }
}
