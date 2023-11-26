package week_06;

import java.util.Scanner;

public class Question_06_17 {
    public static void printMatrix(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", ((int) (Math.random() * 2)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = input.nextInt();
        printMatrix(number);
    }

}