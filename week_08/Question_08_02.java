package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] grid = readMatrix();
        System.out.printf("Sum of the elements in the major diagonal is %.2f", findMajorDiagonal(grid));
    }

    private static double findMajorDiagonal(double[][] grid) {
        double d1 = 0;
        double d2 = 0;
        for (int i = 0; i < 4; i++) {
            d1 += grid[i][i];
            d2 += grid[i][grid.length - i - 1];
        }
        return Math.max(d1, d2);
    }

    private static double[][] readMatrix() {
        double[][] grid = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix row by row: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = input.nextDouble();
            }
        }
        return grid;
    }


}
