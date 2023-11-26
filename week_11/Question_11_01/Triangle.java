package week_11.Question_11_01;

import java.util.Date;

public class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    public Triangle() {
        super();
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {

        super(color, filled);
        System.out.println("tri");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {

        return "Triangle: side1 = " +
                side1 + " side2 = " + side2 + " side3 = " + side3 +
               super.toString()  + " area : " + getArea() + " perimeter : " + getPerimeter();
    }
}
