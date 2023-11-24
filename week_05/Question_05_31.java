package week_05;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int period = input.nextInt();
        double monthlyInterestRate = annualPercentage / 1200;

        System.out.printf("%-5s %-7s ", "Month", "CD Value");

        for (int i = 1; i <= period; i++) {
            deposit += (deposit * monthlyInterestRate);
            System.out.printf("\n%5d %7.2f", i, deposit);
        }
    }
}
