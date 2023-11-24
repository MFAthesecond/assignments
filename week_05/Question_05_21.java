package week_05;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        double numberOfYears = input.nextDouble();

        double monthlyPayment = 0;
        double totalPayment = 0;
        System.out.printf("%-15s %-15s %-15s", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double i = 5.0; i <= 8; i += 0.125) {
            double monthlyInterestRate = i / 1200;
            monthlyPayment = (loanAmount * monthlyInterestRate) /
                    (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));
            totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("\n%-15.3f %-15.2f %-15.2f", monthlyInterestRate, monthlyPayment, totalPayment);
        }
    }
}
