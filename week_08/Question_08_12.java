package week_08;

import java.util.Scanner;


public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-Single filer, 1-Married jointly -or qualifying widow(er), 2-Married separately, 3-Head of household" +
                "Enter filling status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = computeTax(status, income);
        System.out.printf("Tax is $%.2f" , tax);


    }

    private static double computeTax(int status, double income) {
        double tax = 0;
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        tax += brackets[status][0] * rates[0];
        for (int i = 1; i < 5; i++) {
            if (brackets[status][i] > income) {
                tax += (income - brackets[status][i - 1]) * rates[i];
                break;
            }
            tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
        }
        return tax;
    }
}
