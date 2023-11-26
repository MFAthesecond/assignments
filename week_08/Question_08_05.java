package week_08;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = fillMatrix();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = fillMatrix();
        double[][] sum = addMatrix(matrix1, matrix2);
        printMatrixes(matrix1, matrix2, sum);


    }

    private static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] sum) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%5.1f %5.1f %5.1f %5s", matrix1[i][0], matrix1[i][1], matrix1[i][2], "");
            System.out.print((i == 1) ? "\b+" : "");
            System.out.printf("%5s %5.1f %5.1f %5.1f %5s", "", matrix2[i][0], matrix2[i][1], matrix2[i][2], "");
            System.out.print((i == 1) ? "\b=" : "");
            System.out.printf("%5s %5.1f %5.1f %5.1f \n", "", sum[i][0], sum[i][1], sum[i][2]);

        }
    }

    private static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    private static double[][] fillMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}