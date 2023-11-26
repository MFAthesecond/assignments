package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_25 {
    public static void solveQuadratic(double[] eqn, double[] roots) {
        int numberOfRoots = findNumberOfRoots(eqn);

        if (numberOfRoots != 0) {
            System.out.println("The number of roots: " + numberOfRoots);
            System.out.print("The root(s) of equation: ");
            for (double r : roots) {
                System.out.printf("%.1f ", r);
            }
        }else System.out.println("The equation has no real root.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c: ");
        double[] eqn = new double[3];
        for (int i = 0; i < 3; i++) {
            eqn[i] = input.nextInt();
        }
        solveQuadratic(eqn, findRoots(eqn, findNumberOfRoots(eqn)));
    }

    private static double[] findRoots(double[] eqn, int numberOfRoots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double[] roots = new double[numberOfRoots];
        double sqDiscriminant = Math.sqrt(b * b - 4 * a * c);
        if (numberOfRoots == 2) {
            roots[0] = ((-b + sqDiscriminant) / (2 * a));
            roots[1] = ((-b - sqDiscriminant) / (2 * a));
        }
        if (numberOfRoots == 1) {
            roots[0] = ((-b + sqDiscriminant) / (2 * a));
        }
        return roots;
    }

    private static int findNumberOfRoots(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return 2;
        }
        if (discriminant == 0) {
            return 1;
        }
        return 0;
    }
}