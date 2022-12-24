package mountainbike;

/**
 *
 * @author Alonso
 */

public class MountainBikeDemo {
    public static void main(String[] args) {
 
MountainBike panadera = new MountainBike(2,3,6,10);


panadera.seatHeight(4);
panadera.changeGear(5);
panadera.changeCadence(3);
panadera.speedUp(100);
panadera.applyBrakes(40);
panadera.printStates();

    }
    
}
