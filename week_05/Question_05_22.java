package week_05;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loanAmount = input.nextInt();
        System.out.print("NumberOfYears: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate");
        double annualInterestRate = input.nextDouble();
        System.out.print("Monthly Payment: ");
        double monthlyPayment = input.nextDouble();
        System.out.print("Total Payment: ");
        double totalPayment = input.nextDouble();

        double monthlyInterest = annualInterestRate / 1200;
        double principal = 0;
        double monthlyInterestPayment = 0;
        System.out.printf("%-12s %-12s %-12s %-12s", "Payment#", "Interest", "Principal", "Balance");
        for (int payment = 1; payment < 13; payment++) {
            monthlyInterestPayment = loanAmount * monthlyInterest;
            principal = monthlyPayment - monthlyInterestPayment;
            loanAmount -= principal;
            System.out.printf("\n%-12d %-12.2f %-12.2f %-12.2f", payment, monthlyInterestPayment, principal, loanAmount);
        }


    }
}
