package my_projects;

import java.sql.SQLOutput;


public class _90degrees {
    public static void main(String[] args) {
        int[][] matrix = {{ 19, 19,  0, 17,  3,  0},
                {  3,  8,  0, 16, 16,  9},
                {  6,  9,  8,  4, 15,  8},
                {  0, 15, 16,  8,  2, 18},
                {  5, 17, 10, 18,  4,  9},
                { 14,  7, 18, 12, 12, 12}};
        System.out.println("Original matrix: ");
        displayMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Rotated matrix: ");
        displayMatrix(matrix);
    }

    private static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

