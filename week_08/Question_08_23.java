package week_08;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = initializeMAtrix();
        checkMatrix(matrix);
    }

    private static int[][] initializeMAtrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    private static void checkMatrix(int[][] matrix) {
        int flippedRow = checkRows(matrix);
        int flippedColumns = checkColumns(matrix);
        System.out.printf("The flipped cell is at (%d, %d)",flippedRow,flippedColumns);
    }

    private static int checkRows(int[][] matrix) {
        int flippedRow = 0;
        for (int i = 0; i < 6; i++) {
            int ones = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    ones++;
                }
            }
            if (ones % 2 == 1) {
                flippedRow = i;
            }
        }
        return flippedRow;
    }

    private static int checkColumns(int[][] matrix) {
        int flippedColumn = 0;
        for (int i = 0; i < 6; i++) {
            int ones = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[j][i] == 1) {
                    ones++;
                }
            }
            if (ones % 2 == 1) {
                flippedColumn = i;
            }
        }
        return flippedColumn;
    }
}
/*

1 0 0 1 1 1
0 1 1 0 1 1
1 1 1 0 1 0
0 1 0 0 0 1
1 0 0 1 1 1
1 1 0 0 1 0


1 1 0 1 0 0

 */