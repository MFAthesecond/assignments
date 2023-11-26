package week_08;

import java.util.Scanner;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = initializeMAtrix();
        displayMatrix(matrix);
        checkMatrix(matrix);

    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void checkMatrix(int[][] matrix) {
        checkRows(matrix);
        checkColumns(matrix);
    }

    private static void checkRows(int[][] matrix) {
        boolean isEvenRows = true;
        for (int i = 0; i < 6; i++) {
            int ones = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    ones++;
                }
            }
            if (ones % 2 == 1) {
                isEvenRows = false;
            }
        }
        System.out.printf("Every row %shave an even number of 1s\n", (isEvenRows ? "" : "does not "));
    }

    private static void checkColumns(int[][] matrix) {
        boolean isEvenRows = true;
        for (int i = 0; i < 6; i++) {
            int ones = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    ones++;
                }
            }
            if (ones % 2 == 1) {
                isEvenRows = false;
            }
        }
        System.out.printf("Every column %shave an even number of 1s", (isEvenRows ? "" : "does not "));

    }

    private static int[][] initializeMAtrix() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }
}
