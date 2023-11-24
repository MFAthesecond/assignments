package week_03;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point's x- and y- coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x /2 +y) > 100) {
            System.out.println("The point is not in triangle.");
        } else System.out.println("The point is in the trianle.");


    }
}

