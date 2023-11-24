package week_02;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and accelaration:");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = v * v / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + length);


    }
}
