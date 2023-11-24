package week_05;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int number = input.nextInt();

        String binary = "";
        for (int i = number; number > 0; number /= 2) {
            binary = (number % 2) + binary;
        }
        System.out.println(binary);
    }
}
