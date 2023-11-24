package week_05;

import java.util.Scanner;

public class Question_05_43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
