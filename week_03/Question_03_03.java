package week_03;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if ((a * d - b * c) == 0) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.printf("x is %.1f and y is %.1f", x, y);
        }


//9,0 4,0 3,0 -5,0 -6,0 -21,0


    }
}