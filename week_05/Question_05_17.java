package week_05;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten number of lines:");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.printf("%-2s", "");
            }
            for (int j = i; j >0; j--) {
                System.out.printf("%-2d", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%-2d", j );
            }
            System.out.println();
        }
    }
}
