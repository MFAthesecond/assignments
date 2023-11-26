package week_09.Question_09_13;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] a = new double[row][column];
        System.out.println("Enter the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(a);
        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }
}

