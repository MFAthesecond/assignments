package week_03;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        double equation = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        if (equation == 0) {
            System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)", p2x, p2y, p0x, p0y, p1x, p1y);
        } else
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", p2x, p2y, p0x, p0y, p1x, p1y);


    }
}
