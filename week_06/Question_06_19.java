package week_06;

import java.util.Scanner;

public class Question_06_19 {
    public static boolean isValid(
            double side1, double side2, double side3) {
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2 && Math.abs(side1 - side2) < side3 && Math.abs(side1 - side3) < side2 && Math.abs(side2 - side3) < side1) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(
            double side1, double side2, double side3) {
        double s = ((side1 + side2 + side3) / 2);
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides for a triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid input!");
        }

    }
}
