package week_08;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] matrix = initializeMatrix();
        int[] maxIndexes = findMaxIndexes(matrix);
        System.out.printf("The location of the largest element is at (%d, %d) ---> %.2f", maxIndexes[0], maxIndexes[1],
                matrix[maxIndexes[0]][maxIndexes[1]]);

    }

    private static int[] findMaxIndexes(double[][] matrix) {
        int[] maxIndexes = new int[2];
        double max = Double.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    maxIndexes[0] = i;
                    maxIndexes[1] = j;
                    max = matrix[i][j];
                }
            }
        }
        return maxIndexes;
    }

    private static double[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] matrix = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
