package week_03;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double co1 = input.nextDouble();
        double co2 = input.nextDouble();

        System.out.printf("Point (%.1f, %.1f) is ",co1,co2);

        double distance =Math.sqrt((co1-0)*(co1-0)+(co2-0)*(co2-0));
        if (distance>10){
            System.out.print("not ");
        }
        System.out.println("in the circle.");

    }
}
