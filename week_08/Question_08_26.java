package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = initializeMatrix();
        double[][] sortedMatrix = sortRows(matrix);
        System.out.println("The row-sorted array is:");
        displayMatrix(sortedMatrix);
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] sortRows(double[][] matrix) {
        double[][] sortedMatrix = Arrays.copyOf(matrix, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(sortedMatrix[i]);
        }
        return sortedMatrix;
    }

    private static double[][] initializeMatrix() {
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
