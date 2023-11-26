package week_06;

import java.util.Scanner;

public class Question_06_07 {
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        double value = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double amount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-6d %.2f\n",i, futureInvestmentValue(amount, monthlyInterestRate, i));
                   }

    }
}
