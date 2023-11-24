package week_05;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int count = number;

        for (int i = 2; i < count; i++) {
            while (number % i == 0) {
                System.out.print(i + ", ");
                number /= i;
            }

        }
        System.out.println("\b\b.");
    }
}
