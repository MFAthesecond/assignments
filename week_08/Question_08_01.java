package week_08;

import java.util.Scanner;

public class Question_08_01 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                if (column == columnIndex) {
                    sum += m[row][column];
                }
            }
        }return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        for (int column = 0; column < 4; column++) {
            System.out.printf("\nSum of the elements at column %d is %.1f", column, sumColumn(matrix, column));
        }


    }
}
