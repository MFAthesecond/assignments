package week_08;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = fillMatrix();
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = fillMatrix();
        double[][] sum = multiplyTwoMatrixes(matrix1, matrix2);
        printMatrixes(matrix1, matrix2, sum);

    }

    private static double[][] multiplyTwoMatrixes(double[][] matrix1, double[][] matrix2) {
        double[][] multiplied = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    multiplied[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiplied;
    }

    private static double[][] fillMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
                System.out.println(matrix[i][j]);
            }
        }
        return matrix;
    }

    private static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] multiplied) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%5.1f %5.1f %5.1f %5s", matrix1[i][0], matrix1[i][1], matrix1[i][2], "");
            System.out.print((i == 1) ? "\b*" : "");
            System.out.printf("%5s %5.1f %5.1f %5.1f %5s", "", matrix2[i][0], matrix2[i][1], matrix2[i][2], "");
            System.out.print((i == 1) ? "\b=" : "");
            System.out.printf("%5s %5.1f %5.1f %5.1f \n", "", multiplied[i][0], multiplied[i][1], multiplied[i][2]);

        }
    }

}
