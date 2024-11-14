package task09;

public class Rectangle implements Figure {

    double hei, wid;

    Rectangle(double hei,double wid){
        this.hei = hei;
        this.wid = wid;
    }
    @Override
    public double getArea() {
        return hei*wid;
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + hei + ", width=" + wid + ", getArea()=" + getArea() + ", getPerimeter()="
                + getPerimeter() + "]";
    }
    @Override
    public double getPerimeter() {
        return hei*2+wid*2;
    }
    
}
