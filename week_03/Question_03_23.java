package week_03;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double co1 = input.nextDouble();
        double co2 = input.nextDouble();

        System.out.printf("Point (%.1f, %.1f) is ", co1, co2);

        if (co1 > 2.5 || co1 < -2.5 || co2 > 5 || co2 < -5) {
            System.out.print("not ");
        }
        System.out.println("in the rectangle.");


    }
}
