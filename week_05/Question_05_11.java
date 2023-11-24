package week_05;

import java.util.Scanner;

public class Question_05_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 100; i < 201; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
