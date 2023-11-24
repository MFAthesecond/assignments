package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name:");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double fedRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double stateRate = input.nextDouble();

        double fedWithholding = ((hours * payRate) * fedRate);
        double stateWithholding = ((hours * payRate) * stateRate);
        System.out.printf("\nEmployee name: %s ", name);
        System.out.printf("\nHours worked: %.2f", hours);
        System.out.printf("\nPay rate : $%.2f", payRate);
        System.out.printf("\nGross pay: $%.2f", (hours * payRate));
        System.out.println("\nDeductions:");
        System.out.printf("\tFederal Withholding (%.1f%%):   $%.2f", (fedRate * 100), fedWithholding);
        System.out.printf("\n\tState Withholding (%.1f%%):  $%.2f", (stateRate * 100), stateWithholding);
        System.out.printf("\n\tTotal Deduction:  $%.2f", (fedWithholding + stateWithholding));
        System.out.printf("\nNet Pay: $%.2f", (hours * payRate) - (fedWithholding + stateWithholding));
    }
}
