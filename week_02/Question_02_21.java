package week_02;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage:");
        double interestRate = input.nextDouble() / 1200;

        System.out.println("Enter number of years:");
        double years = input.nextDouble();

        double value = amount * (Math.pow((1 + interestRate), (years * 12)));

        System.out.printf("Accumulated value is: %.2f", value);

    }
}