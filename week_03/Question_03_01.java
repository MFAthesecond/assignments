package week_03;;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1=0, r2 = 0;
        int root = 0;
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) root = 2;
        if (discriminant == 0) root = 1;

        if (root > 0) {
            r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            if (root > 1) {
                 r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            }
        }

        if (root == 0) System.out.println("The equation has no real roots");
        else if (root > 1) System.out.printf("The equation has two roots %.6f and %.6f " , r1, r2);
        else System.out.print("The equation has one root "+ r1);


    }
}
