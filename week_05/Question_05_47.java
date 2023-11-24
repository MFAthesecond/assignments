package week_05;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String digits = "978013213080";
        int sum = 0;

        for (int d = 0; d < 12; d++) {
            int number = -48 + (int) digits.charAt(d);
            if (d % 2 == 1) {
                number *= 3;
            }
            sum += number;
        }
        int checsum = 10 - sum % 10;
        System.out.printf("The ISBN-13 number is %s%d", digits, checsum);
    }
}