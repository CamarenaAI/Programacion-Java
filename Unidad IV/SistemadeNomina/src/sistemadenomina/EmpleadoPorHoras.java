package sistemadenomina;

/**
 *
 * @author Alonso
 */

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    //Constructor
    public EmpleadoPorHoras(String nombre, String apellido, 
            String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas){
            super(nombre, apellido, numeroSeguroSocial);
            establecerSueldo(sueldoPorHora);
            establecerHoras(horasTrabajadas);
    }
    
    //Establecer sueldo de empleado por horas
    public void establecerSueldo(double cantidadSueldo){
        sueldo = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
    }
    
    //Devolver Sueldo
    public double obtenerSueldo(){
        return sueldo;
    }
    
    //Establecer horas trabajadas del empleado
    public void establecerHoras(double horasTrabajadas){
        horas = (horasTrabajadas >= 0.0 &&
                horasTrabajadas <= 168.0) ? horasTrabajadas : 0.0;
    }
    
    //Devolver Horas
    public double obtenerHoras(){
        return horas;    
    }    
    
    //Calcular pago del empleado por horas
    //Sobreeescribir el metodo abstracto ingresos en empleado
    public double ingresos(){
        if(horas >= 40)      //Sin Tiempo extra
        return sueldo * horas;
        else
        return 40 * sueldo + (horas - 40) * sueldo * 1.5;   
        }
    
    public String toString(){
    return "\nEmpleado por horas: " + super.toString();
    }
    }
