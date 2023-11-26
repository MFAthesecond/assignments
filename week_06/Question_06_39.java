package week_06;

import java.util.Scanner;

public class Question_06_39 {
    /**
     * Return true if point (x2, y2) is on the left side of the
     * directed line from (x0, y0) to (x1, y1)
     */
    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0);
    }

    /**
     * Return true if point (x2, y2) is on the same
     * line from (x0, y0) to (x1, y1)
     */
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);

    }

    /* line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2) {
        return ((x2 > x0 && y2 > y0) || (x2 < x1 && y2 < y1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points fo p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String part = "";
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            part = "left side of the line";
        }
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            part = onTheLineSegment(x0, y0, x1, y1, x2, y2) ? "line segment" : "same line";
        } else part="right side of the line";
        System.out.printf("(%.1f, %.1f) is on the %s from (%.1f, %.1f) to (%.1f, %.1f)",x2,y2,part,x0,y0,x1,y1);
    }
}
//1 1 2 2 1,5 1,5