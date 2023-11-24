package week_03;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB:");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int selection = input.nextInt();
        if (selection == 1) {
            System.out.print("Enter the RMB amount:");
            int RMB = input.nextInt();
            double amount = RMB / rate;
            System.out.printf("%d yuan is %.2f dollars", RMB, amount);

        } else if (selection == 0) {
            System.out.print("Enter the dollar amount:");
            int dollars = input.nextInt();
            double amount = dollars * rate;
            System.out.printf("%d dollars is %.2f yuans", dollars, amount);
        } else System.out.println("Incorrect input.");


    }


}

