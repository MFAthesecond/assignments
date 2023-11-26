package week_09.Question_09_01;

public class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
void displayProperties(){
    System.out.println("Width        :"+width);
    System.out.println("Height       :"+height);
    System.out.println("Area         :"+getArea());
    System.out.println("Perimeter    :"+getPerimeter());
}
}