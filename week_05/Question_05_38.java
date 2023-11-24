package week_05;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String octal = "";


        System.out.println("Enter a decimal integer:");
        int decimal = input.nextInt();
        for (int i = decimal; i > 0; i /= 8) {
            octal = (i % 8) + octal;
        }
        System.out.printf("The octal of %d is %s", decimal, octal);
    }
}
