package week_09.Question_09_04;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random ra = new Random(1000);
        System.out.println("Random numbers are: ");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(ra.nextInt(100) + " ");
        }
    }
}
