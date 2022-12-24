package sistemadenomina;

/**
 *
 * @author Alonso
 */

public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
 //Constructor
    public Empleado(String nombre, String apellido, String ssn){
    primerNombre = nombre;
    apellidoPaterno = apellido ;
    numeroSeguroSocial = ssn;  
    }
    
    //Establecer el primer nombre
    public void establecerPrimerNombre(String nombre){
    primerNombre = nombre;
    
    }
    
    //Devolver el primer nombre
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    //Establecer el Apellido Paterno
    public void establecerApellidoPaterno(String apellido){
    apellidoPaterno = apellido ;
    
    }
    
    //Devolver el ApellidoPaterno
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    //Establecer el numero de Seguro Social
    public void establecerNumeroSeguroSocial(String numero){
    numeroSeguroSocial = numero;
    
    }
    
    //Devolver el numero de Seguro Social
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }

    public String toString(){
    return obtenerPrimerNombre() + " " + obtenerApellidoPaterno()
    + "\nnumero de seguro social: " +  obtenerNumeroSeguroSocial();       
    }
    
    //metodo abstracto sobreescrito por subclases
    public abstract double ingresos();
}
