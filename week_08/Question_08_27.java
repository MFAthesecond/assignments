package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = initializeMatrix();
        double[][] sortedMatrix = sortColumns(matrix);
        System.out.println("The column-sorted array is:");
        displayMatrix(sortedMatrix);
    }

    private static double[][] sortColumns(double[][] matrix) {
        double[][] columns = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                columns[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < columns.length; i++) {
            Arrays.sort(columns[i]);
        }
return columns;
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
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
