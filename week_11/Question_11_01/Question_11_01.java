package week_11.Question_11_01;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true / false)?");
        boolean filled = input.next().equalsIgnoreCase("true");

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle.toString());

    }
}
