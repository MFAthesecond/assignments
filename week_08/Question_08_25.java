package week_08;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = initializeMAtrix();
        System.out.printf("It is %sa Markov matrix ",(isMarkovMatrix(matrix))?"":"not ");


    }

    private static boolean isMarkovMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < 0) {
                    return false;
                }
                sum += matrix[j][i];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    private static double[][] initializeMAtrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

}
/*
0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12 0,4
 */