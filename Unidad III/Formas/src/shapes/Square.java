package shapes;

/**
 *
 * @author Alonso
 */

public class Square extends Rectangle{
    double Side;
    
    //Constructor
    public Square(){}
    
    public Square(double newSide){}
    
    public Square(double newSide, String newColor, boolean newFilled){}    
    
    double getSide(){
        return Side;
    }
    
    public void setSide(double newSide){
        Side = newSide;
    }
    
    public void setWidth(double newSide){
        Width = newSide;
    }    
    
    public void setLength(double newSide){
        Lenght = newSide;
    } 
    
   public String toString(){
   return "Color: " + getColor() + 
           ", Filled: " + isFilled() + 
           ", Side: " + getSide() + 
           ", Area: " + getArea() + 
           ", Perímetro: " + 4 * getSide();
   }    
}
