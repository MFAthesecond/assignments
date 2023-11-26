package week_08;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        double[][] points = initializeMatrix();
        boolean isSameLine = sameLine(points);
        System.out.println("The five points are " + (isSameLine ? "" : "not ") + "on the same line");
    }

    private static boolean sameLine(double[][] points) {
        double[] point0 = points[4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;
                for (int k = 0; k < 2; k++) {
                    double[] point1 = points[i];
                    double[] point2 = points[j];
                    if ((point1[0] - point0[0]) * (point2[1] - point0[1]) -
                            (point2[0] - point0[0]) * (point1[1] - point0[1]) != 0) {
                        return false;
                    }

                }
            }
        }
        return true;
    }

    private static double[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[5][2];
        System.out.println("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
// 3,4 2 6,5 9,5 2,3 2,3 5,5 5 -5 4