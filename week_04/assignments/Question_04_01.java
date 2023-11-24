package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the legnth from the center to a vertex:");
        double r = input.nextDouble();

        double pi = Math.PI;
        double s = 2 * r * Math.sin(pi / 5);

        double area = (5 * s * s) / (4 * Math.tan(pi / 5));

        System.out.printf("The area of the pentagon is %.2f", area);

    }
}
