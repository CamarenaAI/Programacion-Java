package alonsotest;

/**
 *
 * @author Alonso
 */

public class AlonsoTest {
    public static void main(String[] args) {
        RecibirCoordenadas Cordenadas = new RecibirCoordenadas();
        Ecuacion calculo=new Ecuacion();
        Imprimir Print = new Imprimir(); 
               double r;
       r= calculo.Ecuacion(Cordenadas.X1(), Cordenadas.X2(), Cordenadas.Y1(), Cordenadas.Y2());
       Print.Imprimir(r);
       Print.Imprimir2(r);
    }
    
}
