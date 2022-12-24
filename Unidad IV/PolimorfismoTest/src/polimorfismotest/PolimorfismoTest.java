package polimorfismotest;

/**
 *
 * @author Alonso
 */

public class PolimorfismoTest {
    public static void main(String[] args) {
    String Impresion;
    
    //Profesor
    Profesor Prof1 = new Profesor("Omar Salazar","321-987-567",45,true,3500,8,24,"A");
    Profesor Prof2 = new Profesor("Gerardo Rodriguez","123-789-765",30,true,2500,7,25,"B");
    Profesor Prof3 = new Profesor("Jesus Jimenez","341-927-567",20,false,1500,6,26,"C");    
    
    //Programador
    Programador Prog1 = new Programador("Martin Rojas","387-900-654",41,true,2500,200,"Lenguaje C");
    Programador Prog2 = new Programador("Victor Gonzalez","783-000-456",31,false,1500,300,"Lenguaje Python");    
    Programador Prog3 = new Programador("Daniel Rodriguez","387-900-654",20,true,3500,400,"Lenguaje Java");
    
    //Director
    Director Dir1 = new Director("Eduardo ???","911-119-191",20,false,400,500);
    Director Dir2 = new Director("Gerardo Pantoja","686-866-299",42,true,500,600);
    Director Dir3 = new Director("Diego Tovar","345-892-987",32,true,600,700);
    
    Prof1.calcularSalario();
    Prof2.calcularSalario();
    Prof3.calcularSalario();
    
    Prog1.calcularSalario();
    Prog2.calcularSalario();
    Prog3.calcularSalario();    
    
    Dir1.calcularSalario();
    Dir2.calcularSalario();
    Dir3.calcularSalario();
    
    
    Impresion=Prof1.imprimirDatos();
    Impresion+=Prof2.imprimirDatos();
    Impresion+=Prof3.imprimirDatos();
    Impresion+=Prog1.imprimirDatos();
    Impresion+=Prog2.imprimirDatos();
    Impresion+=Prof3.imprimirDatos();
    Impresion+=Dir1.imprimirDatos();
    Impresion+=Dir2.imprimirDatos();
    Impresion+=Dir3.imprimirDatos();
        
    System.out.print(Impresion);
    System.exit(0);
    }
}