package week_07;

import java.util.Arrays;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            int i = student;
            while (i <= 100) {
                lockers[i - 1] = !lockers[i - 1];
                i += student;
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}

