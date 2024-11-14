package task09;

public class Circle implements Figure{

    double radius;
    Circle(double radius){
        this.radius= radius;
    }
    @Override
    public double getArea() {
        return radius*radius*3.141516926535;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
                + "]";
    }
    @Override
    public double getPerimeter() {
        return radius*2*3.141516926535;
    }
    
}
