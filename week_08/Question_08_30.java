package week_08;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a00, a01, a10, a11, b0 and b1:");
        double[][] a = new double[2][2];
        double[] b = new double[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            b[i] = input.nextInt();
        }
        double[] equation = linearEquation(a, b);
        System.out.printf("x is %.1f and is %.1f", equation[0], equation[1]);
    }

    private static double[] linearEquation(double[][] a, double[] b) {
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
            return null;
        }
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double[] list = {x, y};
        return list;
    }
}
