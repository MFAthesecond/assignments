package week_05;

import java.util.Scanner;

public class Question_05_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-10s %-10s", "Miles", "Kilometers");

        for (int i = 1; i < 11; i++) {
            System.out.printf("\n%-10d %-10.3f", i, (i * 1.609));
        }
    }
}
