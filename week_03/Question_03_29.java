package week_03;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle r1's center x-, y-coordinates and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.println("Enter circle r2's center x-, y-coordinates and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if (distance < radius1 + radius2) {
            if (distance > radius2 * 2) System.out.println("circle2 is inside circle 1");
            else System.out.print("circle2 overlaps circle1 ");
        } else System.out.println("circle2 does not overlap circle1");


    }
}
