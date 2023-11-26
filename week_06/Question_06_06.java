package week_06;

import java.util.Scanner;

public class Question_06_06 {
    public static void displayPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.printf("%-2s","");
            }
            for (int j = i; j >0; j--) {
                System.out.printf("%-2d",j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        displayPattern(rows);

    }
}
