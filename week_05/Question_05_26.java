package week_05;

import java.util.Scanner;

public class Question_05_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double e = 0;

        double start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            double payda = 1;
            for (int j = 1; j < i; j++) {
                payda *= j;
            }
            e += 1 / payda;
            if (i == 10000) {
                System.out.println("e at i = 10000 is " + e);
            }
            if (i == 20000) {
                System.out.println("e at i = 20000 is " + e);
            }
            if (i == 100000) {
                System.out.println("e at i = 100000 is " + e);
            }
        }
    }
}
