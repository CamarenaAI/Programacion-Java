package shapes;

/**
 *
 * @author Alonso
 */

public class Shape {

    String Color = "Red"; 
    boolean Filled = true;
    float Area;
    float Perimeter;
    
    //Constructor
    public Shape(){}    

    public Shape(String newColor, boolean newfilled){
    Color = newColor;
    Filled = newfilled;
    }

    String getColor(){
    return Color;
    }
    
    public void setColor(String newColor){
    Color = newColor;     
    }
    
    boolean isFilled(){
    return Filled;
    }
    
    public void setFilled(boolean newfilled){
    Filled = newfilled;    
    }
   
   public String toString(){
   return "Color: " + getColor() + "Filled: " + isFilled();
   }
}
