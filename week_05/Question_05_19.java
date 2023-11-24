package week_05;

import java.util.Scanner;

public class Question_05_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = 8;
        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < lines - i; j++) {
                System.out.printf("%-5s", "");
            }
            int number = 1;
            for (int i1 = 1; i1 <= i + 1; i1++) {
                System.out.printf("%-5d", number);
                number *= 2;
            }
            number /= 4;
            for (int j = i; j >= 1; j--) {
                System.out.printf("%-5d", number);
                number /= 2;
            }
            System.out.println();
        }
    }
}

