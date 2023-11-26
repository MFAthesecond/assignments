package week_10.Question_10_04;

public class MyPoint {
    public double x;
    public double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
public double distance(MyPoint myPoint){
    return Math.sqrt((this.x- myPoint.x)*(this.x- myPoint.x)+(this.y- myPoint.y)*(this.y- myPoint.y));
}
}
