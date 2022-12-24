package bicycle;

/**
 *
 * @author Alonso
 */

public class Bicycle {

    int cadence = 0;  //Velocidad a la que pedalea un ciclista
    int speed = 0;    //Velocidad
    int gear = 1;     //Cambios
   
 
 
 //Metodos 
    void changeCadence(int newValue) {
         cadence = newValue;
    }
    void changeGear(int newValue) {
         gear = newValue;
    }
    void speedUp(int increment) {
         speed = speed + increment;
    }
    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
    
    void printStates(){
        System.out.println("cadence: " +
             cadence + " speed: " +
             speed + " gear: " + gear);
    }
 
}
