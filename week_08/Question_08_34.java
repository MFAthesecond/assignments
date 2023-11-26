package week_08;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = initializePoints();
        double[] rightmostLowest = findRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)", rightmostLowest[0], rightmostLowest[1]);

    }

    private static double[] findRightmostLowestPoint(double[][] points) {
        double[] rightmostLowest = new double[2];
        double rm = 0;
        for (int i = 0; i < points.length; i++) {
            if (findDiagonal(points[i]) > rm) {
                rm=findDiagonal(points[i]);
                rightmostLowest[0] = points[i][0];
                rightmostLowest[1] = points[i][1];
                //  }
            }
        }
        return rightmostLowest;
    }

    private static double findDiagonal(double[] point) {
        return point[0] - point[1];
    }

    private static double[][] initializePoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
/*
1,5 2,5 -3 4,5 5,6 -7 6,5 -7 8 1 10 2,5
 */