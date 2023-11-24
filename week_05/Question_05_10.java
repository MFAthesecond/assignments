package week_05;

import java.util.Scanner;

public class Question_05_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (i % 30 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
