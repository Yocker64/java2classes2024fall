package task09;
;
public class Triangle implements Figure{

    double si1, si2, si3, area,per;

    @Override
    public double getArea() {
        return Math.sqrt((si1+si2+si3)/2*((si1+si2+si3)/2-si1)*((si1+si2+si3)/2-si2)*((si1+si2+si3)/2-si3));
    }

    public Triangle(double si1, double si2, double si3) {
        this.si1 = si1;
        this.si2 = si2;
        this.si3 = si3;
    }

    @Override
    public String toString() {
        return "Triangle [si1=" + si1 + ", si2=" + si2 + ", si3=" + si3 + ", area=" + area + ", per=" + per
                + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
    }

    @Override
    public double getPerimeter() {
       return si1 + si2 + si3;
    }
    
}
