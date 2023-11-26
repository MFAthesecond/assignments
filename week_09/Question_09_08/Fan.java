package week_09.Question_09_08;

public class Fan {
    public int SLOW = 1;
    public int MEDIUM = 2;
    public int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            return "Fan color: " + this.color + ", radius: " + this.radius + "\nFan is off";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
