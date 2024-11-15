package task09;

public class Square implements Figure{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
    }


}
