package shapes;

/**
 *
 * @author Alonso
 */

public class Rectangle extends Shape{
 
    double Width = 1.0;
    double Lenght = 1.0;
    
    //Constructor
    public Rectangle(){}

    Rectangle(double newWidth, double newLenght){}
    
    Rectangle(double newWidth, double newLenght, String newColor, boolean newFilled){}
    
    double getWidth(){
        return Width;   
    }
    
    public void setWidth(double newWidth){
        Width = newWidth;
    }    
    
    double getLenght(){
        return Lenght; 
    }
    
    public void setLength(double newLenght){
        Lenght = newLenght;
    }    
    
    double getArea(){
        Area = (float) (getWidth() * getLenght());
        return Area;
    }
    
    double getPerimeter(){
        Perimeter = (float) ((getWidth() + getLenght()) * 2);
        return Perimeter;
    }
    
   public String toString(){
   return super.toString() + ", Width " + getWidth() + 
           ", Lenght " + getLenght() + 
           ", Area: " + getArea() + 
           ", Perimeter: " + getPerimeter();
   }
}
