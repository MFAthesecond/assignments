package week_05;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g. 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g. 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g. 6)");
        int months = input.nextInt();
        double monthlyInterestRate = annualInterestRate / (1200);

        double sum = 0;

        for (int i = 0; i < months; i++) {
            sum += 100;
            sum *= (1 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after %d months: %.2f", months, sum);
    }
}
