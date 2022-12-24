package sistemadenomina;

/**
 *
 * @author Alonso
 */

public class EmpleadoPorComision extends Empleado{
    private double ventasTotales;
    private double tasaComision;
    
    
    //Constructor
    public EmpleadoPorComision(String nombre, String apellido,
            String numeroSeguroSocial, double ventasTotalesSemana,
            double porcentaje){
        super(nombre, apellido, numeroSeguroSocial);
        establecerVentasTotales(ventasTotalesSemana);
        establecerTasaComision(porcentaje);
}
    
//Establecer la tasa de Comision
public void establecerTasaComision(double tasa){
    tasaComision = (tasa > 0.0 && 0.00 < 1.0) ? tasa : 0.00;
} 

//Devolver la tasa Comision
public double obtenerTasaComision(){
    return tasaComision;
}
    
//Establecer salario base semanal por comision
public void establecerVentasTotales(double ventas){
    ventasTotales = ventas < 0.00 ? 0.00 : ventas;
}

//Devolver la cantidad de ventas totales del empleado por comision
public double obtenerVentasTotales(){
    return ventasTotales;
}

//Calcular pago del empleado por comision
//Sobreecribir el metodo abstracto ingreso en empleado
public double ingresos(){
    
    return obtenerTasaComision() * obtenerVentasTotales();
}

//Devolver la representacionString del objeto
public String toString(){
    return "\nEmpleado por Comision: " + super.toString();
}

}
