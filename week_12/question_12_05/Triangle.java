package week_12.question_12_05;

import week_11.Question_11_01.GeometricObject;

public class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    public Triangle() {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side3 + side2 < side1 || side1 + side3 < side2) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) throws IllegalTriangleException {

        super(color, filled);
        if (side1 + side2 < side3 || side3 + side2 < side1 || side1 + side3 < side2) {
            throw new IllegalTriangleException();
        }
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
        double s = (getSide1() + getSide2() + getSide3()) / 2;
        System.out.println("s________"+s);
        return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {

        return "Triangle: side1 = " +
                side1 + " side2 = " + side2 + " side3 = " + side3 +
                " \ncreated on: " + getDateCreated() + "\ncolor: " + getColor() + " and filled: "
                + isFilled() + " \narea : " + getArea() + " \nperimeter : " + getPerimeter();
    }
}


