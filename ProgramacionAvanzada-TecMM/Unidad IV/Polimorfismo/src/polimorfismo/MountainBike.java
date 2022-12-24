/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Alonso
 */

public class MountainBike extends Bicycle{
    private String suspension;
    
    //The MountainBike subclass has one constructor
    public MountainBike(int startCadence,
                        int startSpeed,
                        int startGear,
                        String suspensionType){
        super(startCadence, startSpeed, startGear);
        this.setSuspension (suspensionType);
    }
    
    //The MountainBike subclass adds one method
    public String getSuspension(){
        return this.suspension;
    }
    
    public void setSuspension(String suspensionType){
        this.suspension = suspensionType;
    }
    
    public void printDescription(){
        super.printDescription();     
        System.out.println("The " +
                     "MountainBike has a" + getSuspension() +
                     " suspension ");
         }
}