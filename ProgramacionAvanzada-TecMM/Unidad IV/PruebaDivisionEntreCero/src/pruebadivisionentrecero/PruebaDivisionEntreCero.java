package pruebadivisionentrecero;

/**
 *
 * @author Alonso
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PruebaDivisionEntreCero extends JFrame implements ActionListener{
    
private JTextField campoEntrada1, campoEntrada2, campoSalida;
private int numero1, numero2, resultado;

    //Configurar GUI
    public PruebaDivisionEntreCero(){
    super("Demostracion de las exepciones");
    
    //Obtener panel de contenido y establecer su esquema
    Container contenedor = getContentPane();
    contenedor.setLayout(new GridLayout(3,2));
    
    //Establecer etiqueta y campEntrada1
    contenedor.add(
    new JLabel("Escriba el numerador ", SwingConstants.RIGHT));
    campoEntrada1 = new JTextField();
    contenedor.add(campoEntrada1);
        
    //Establecer etiqueta y campEntrada2
    contenedor.add(new JLabel("Escriba el denominador y oprima Intro ", 
    SwingConstants.RIGHT));
    campoEntrada2 = new JTextField();
    contenedor.add(campoEntrada2);
    campoEntrada2.addActionListener(this);
    
    //Establecer etiqueta y Salida
    contenedor.add(new JLabel("Resultado ", SwingConstants.RIGHT));
    campoSalida = new JTextField();
    contenedor.add(campoSalida);
    
    setSize(500,100);
    setVisible(true);
       
    }
    
    //Procesar eventos GUI
    public void actionPerformed(ActionEvent evento){
        
    campoSalida.setText( ""); //Borrar campo salida
    //Leer numeros y calcular cociente
    
    try{
    numero1 = Integer.parseInt(campoEntrada1.getText());
    numero2 = Integer.parseInt(campoEntrada2.getText());
    
    resultado = cociente(numero1, numero2);
    campoSalida.setText(String.valueOf(resultado));
    }
    
    //Procesar la entrada de lformato incorrecto-
    catch(NumberFormatException excepcionFormatoNumero){
        
    JOptionPane.showMessageDialog(this, "Debe escribir dos numeros ",
    "Formato de numero invalido", JOptionPane.ERROR_MESSAGE);
    }

    catch(ArithmeticException excepcionAritmetica){
        
    JOptionPane.showMessageDialog(this, excepcionAritmetica.toString(),
    "Excepcion aritmetica", JOptionPane.ERROR_MESSAGE);
    }
    
    }

    //Demuestra como lanzar una excepcion cuando ocuree una division entre cero
    public int cociente(int numerador, int denominador)
        throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String args[]){
        PruebaDivisionEntreCero aplicacion = new PruebaDivisionEntreCero();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

    
    

