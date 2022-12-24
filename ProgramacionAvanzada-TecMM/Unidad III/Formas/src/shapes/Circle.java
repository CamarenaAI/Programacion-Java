package shapes;

/**
 *
 * @author Alonso
 */

public class Circle extends Shape{
    
    double Radius = 1.0;
    
    //Constructor
    public Circle(){}
    
    public Circle(double newRadius){}
    
    //Constructor
    public Circle(double newRadius,String newColor, boolean newFilled){
        
    }
    
    //Obtener Radio
    double getRadius(){
        return Radius;
    }
    
    //
    public void setRadius(double newRadius){
        Radius = newRadius;        
    }    

    double getArea(){
    Area = (float) (Math.PI * getRadius() * getRadius());
        return Area;
    }    

    double getPerimeter(){
    Perimeter = (float) (Math.PI * 2 * getRadius());    
        return Perimeter;
    }
    
       public String toString(){
        return super.toString() + ", Radius: " + getRadius()
           + ", Área: " + getArea()+ 
           ", Perímeter: " + getPerimeter();
   }
}
