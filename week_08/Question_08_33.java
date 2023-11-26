package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = initializePoints();
        getArea(points);

    }

    private static void getArea(double[][] points) {
        double[] areas = new double[4];
        double[] intersectionPoint = getIntersectingPoint(points);
        double[][] t1 = new double[3][3];
        t1[0] = points[0];
        t1[1] = points[1];
        t1[2] = intersectionPoint;
        areas[0] = getTriangleArea(t1);

        double[][] t2 = new double[3][3];
        t2[0] = points[1];
        t2[1] = points[2];
        t2[2] = intersectionPoint;
        areas[1] = getTriangleArea(t2);

        double[][] t3 = new double[3][3];
        t3[0] = points[2];
        t3[1] = points[3];
        t3[2] = intersectionPoint;
        areas[2] = getTriangleArea(t3);

        double[][] t4 = new double[3][3];
        t4[0] = points[0];
        t4[1] = points[3];
        t4[2] = intersectionPoint;
        areas[3] = getTriangleArea(t4);

        Arrays.sort(areas);
        System.out.println("The areas are: ");
        for (double val : areas) {
            System.out.printf("%.2f" + " ", val);
        }

    }

    private static void displayAreas(double[] area) {
        System.out.println("The areas are ");
        for (int i = 0; i < area.length; i++) {
            System.out.print(area[i] + " ");
        }
    }

    private static double[] getIntersectingPoint(double[][] points) {
        double[] interSectPoint = new double[2];

        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        interSectPoint[0] = (e * d - b * f) / (a * d - b * c);
        interSectPoint[1] = -(a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            return null;
        }
        return interSectPoint;
    }

    private static double getTriangleArea(double[][] points) {
        double side1 = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2));
        double side2 = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        double side3 = Math.sqrt(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2));

        double s = ((side1 + side2 + side3) / 2);

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    private static double[][] initializePoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        points[4] = getIntersectingPoint(points);
        return points;
    }
}
/*
-2,5 2 4 4 3 -2 -2 -3,5
 */