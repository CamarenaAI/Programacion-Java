package mountainbike;

/**
 *
 * @author Alonso
 */

public class MountainBike extends Bicycle{
    
    public int seatHeight;
    
    //The MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    //The MountainBike subclass adds one method
    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
    
    
         public void printStates(){
             System.out.println("Cadence: " +
                     cadence + ", Speed: " +
                     speed + ", Gear: " + gear + ", Seat: " + seatHeight);
         }
}
    
