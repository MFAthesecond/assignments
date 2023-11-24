package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point 1 (langtitude and longtitude):");

        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.println("Enter point 2 (langtitude and longtitude):");

        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double radius = 6371.01 ;
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.printf("The distance between the two points is %f km", distance);

    }
}
//39,55 -116,25
//41,5 87,37
