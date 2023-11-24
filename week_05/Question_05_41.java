package week_05;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the commission amount:");
        final int COMMISSION_AMOUNT = input.nextInt();
        double sales = 0;

        for (int i = 1; i <= COMMISSION_AMOUNT; i++) {
            if (i <= 400) {
                sales +=  12.5;
            } else if (i <= 900) {
                sales +=  10;
            } else sales +=  8.333333333;
        }
        System.out.printf("Minimum sales to earn $%.0f",sales);
    }
}
