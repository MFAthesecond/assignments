package week_05;

import java.util.Scanner;

public class Question_05_25 {
    public static void main(String[] args) {
        double number = 0;
        for (int i = 1; i <= 100000; i += 1) {
            number += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i % 10000 == 0) {
                System.out.printf("PI value for %d= %.19f\n", i, (4 * number));
            }
        }
    }
}

