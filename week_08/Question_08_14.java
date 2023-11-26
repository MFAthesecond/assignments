package week_08;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix();
        displayMatrix(matrix);
        analyzeMatrix(matrix);

    }

    private static void analyzeMatrix(int[][] matrix) {
        if (analyzeRows(matrix)) {
            System.out.println("No same numbers on a row");
        }
        if (analyzeColumns(matrix)) {
            System.out.println("No same numbers on a column");
        }
        if (analyzeDiagonals(matrix)) {

        }
    }

    private static boolean analyzeDiagonals(int[][] matrix) {
        return false;
    }

    private static boolean analyzeColumns(int[][] matrix) {

        boolean any = true;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][i] == matrix[j - 1][i]) {
                    count++;
                }
                if (count == 3) {
                    System.out.printf("All %ds on column %d\n", matrix[j][i], i);
                    any = false;
                }
            }
        }
        return any;
    }

    private static boolean analyzeRows(int[][] matrix) {

        boolean any = true;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[i][j - 1]) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.printf("All %ds on row %d\n", matrix[i][0], i);
                any = false;
            }
        }
        return any;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix: ");
        int size = 4;//input.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }
}
