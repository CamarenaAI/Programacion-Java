package sistemadenomina;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alonso
 */

public class PruebaSistemasNomina {
    public static void main(String[] args) {
    DecimalFormat dosDigitos = new DecimalFormat("0.00");
    
    //Crear arreglo de tipo empleado
    Empleado empleados[] = new Empleado[4];
    
    //Inicializar arreglo con empleados
    empleados[0] = new EmpleadoAsalariado("Jose", "Palomin", "111-111-111", 800.00);
    empleados[1] = new EmpleadoPorComision("Charlie", "Cena", "222-222-222", 10000, 0.6);
    empleados[2] = new EmpleadoBaseMasComision("Antonio", "Parker", "333-333-333",5000, 0.04, 300);
    empleados[3] = new EmpleadoPorHoras("Tony", "Buñuelos", "422-14-2241", 16.75, 40);
    
    String salida = "";

   //Procesar genericamente cada elemento en el arreglo empleados
    for(int i=0; i < empleados.length; i++){
        salida += empleados[i].toString();
        
    //Determinar si el elemento es un empleadoBaseMasComision
    if(empleados[i] instanceof EmpleadoBaseMasComision){
        //Conversion descendente de referencia a Empleado a
        //referencia a EmpleadoBaseMasComision
    
    EmpleadoBaseMasComision empleadoActual = (EmpleadoBaseMasComision) empleados[i];
    double salarioBaseAnterior = empleadoActual.obtenerSalarioBase();
    salida +="\nSalario base anterior: $" + salarioBaseAnterior;
    
    empleadoActual.establecerSalarioBase(1.10 * salarioBaseAnterior);
    salida +="\nEl nuevo salario base con aumento del 10% es: $" + 
    empleadoActual.obtenerSalarioBase();
    
    }
    salida += "\nGano: $" + empleados[i].ingresos() + "\n";
    }
    
    //Obtener noombre del tipo de cada objeto
    for(int j =0; j < empleados.length; j++)
    
    salida += "\nEl empleado " + j + " es un " + empleados[j].getClass().getName();
    
    JOptionPane.showMessageDialog(null, salida);
    System.exit(0);
    }
}    
    
    

