package polimorfismo;

/**
 *
 * @author Alonso
 */

public class Bicycle {
   
    int cadence = 0;  //Velocidad a la que pedalea un ciclista
    int speed = 0;    //Velocidad
    int gear = 1;     //Cambios
   
    public Bicycle(int startCadence, int startSpeed, int startGear){
     gear = startGear;
     cadence = startCadence;
     speed = startSpeed;
 }
 
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
    
    void printDescription(){
        System.out.println("\nBike is " + "in gear " +
        this.gear + " With a cadence of: " +
        this.cadence + " and traveling at a speed of " +  this.speed + ". ");
    }
}