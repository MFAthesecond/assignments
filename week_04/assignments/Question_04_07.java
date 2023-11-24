package week_04.assignments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

       System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        double angleIncrement = Math.toRadians(360 / 5.0); // Divide by number of points

        double p1Angle = angleIncrement;
        double p2Angle = angleIncrement * 2;
        double p3Angle = angleIncrement * 3;
        double p4Angle = angleIncrement * 4;
        double p5Angle = angleIncrement * 5;

        System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p1Angle), radius * Math.cos(p1Angle));
        System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p2Angle), radius * Math.cos(p2Angle));
        System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p3Angle), radius * Math.cos(p3Angle));
        System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p4Angle), radius * Math.cos(p4Angle));
        System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p5Angle), radius * Math.cos(p5Angle));

    }
}
