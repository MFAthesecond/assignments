package week_05;

import java.util.Scanner;

public class Question_05_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-10s %10s", "Kilograms", "Pounds");
        for (int i = 1; i < 201; i+=2) {
            System.out.printf("\n%-10d %10.1f", i, (i * 2.2));
        }
    }
}
