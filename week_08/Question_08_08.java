package week_08;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        double[][] points = fillMatrix();
        int[] distances = findDistances(points);
        boolean[] isLeast = findClosestPoints(distances, points);
        printResult(isLeast, points);
    }

    private static boolean[] findClosestPoints(int[] distances, double[][] points) {
        double min = Integer.MAX_VALUE;
        boolean[] leastDistances = new boolean[distances.length];
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] < min) {
                min = distances[i];
            }
        }
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == min) {
                leastDistances[i] = true;
            }
        }
        return leastDistances;

    }

    private static double[][] fillMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 8 points: ");
        double[][] matrix = new double[8][2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    private static void printResult(boolean[] isLeast, double[][] points) {
        for (int x = 0; x < isLeast.length; x++) {
            if (isLeast[x]) {
                System.out.print("The closest two points are ");
                for (int i = 0; i < 2; i++) {
                    System.out.print("(");
                    for (int j = 0; j < 2; j++) {
                     //   System.out.print(points[]+",");
                    }
                    System.out.print("\b) and ");
                }
            }
        }
        System.out.print("\b\b\b\b");
    }

    private static int[] findDistances(double[][] points) {
        //array to store each distance and the minimum at [0]
        int[] distances = new int[(int) ((points.length + 1) * 1.5)];

        double shortestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                else if (findDistance(points[i], points[j]) < shortestDistance) {
                    shortestDistance = findDistance(points[i], points[j]);
                }
            }
        }
        return distances;
    }

    private static double findDistance(double[] point1, double[] point2) {
        return Math.sqrt(
                Math.pow(point1[0] - point2[0], 2)          //x
                        + Math.pow(point1[1] - point2[1], 2));     //y
    }
}
// 0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
