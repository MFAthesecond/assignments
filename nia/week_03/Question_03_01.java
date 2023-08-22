package week_02.assignments.assignments.nia.week_03;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0) {
            double r1 = (-b + (Math.pow(((b * b) - 4 * a * c), 0.5))) / 2 * a;
            double r2 = (-b - (Math.pow(((b * b) - 4 * a * c), 0.5))) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r = -b / 2 * a;
            System.out.println("The equation has one root " + r);
        } else {
            System.out.println("The equation has no real roots ");
        }

    }
}
