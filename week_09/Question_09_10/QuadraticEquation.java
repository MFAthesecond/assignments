package week_09.Question_09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public void displayRoots() {
        if (getDiscriminant() == 0) {
            System.out.printf("The equation has on root %.1f", getRoot1());
        }else if (getDiscriminant()>0){
            System.out.printf("The equation has two roots %.3f and %.3f",getRoot1(),getRoot2());
        }else System.out.println("The equation has no real roots");

    }
}
