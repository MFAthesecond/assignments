package week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your amount (e.g 12,42)");
        double amount = input.nextDouble();

        System.out.printf("Your amount %f consist of ", amount);

        int dollar = (int) amount;
        System.out.println("\n" + dollar + " dollar");
        String fix = (dollar > 1) ? "s" : "";

        int amount2 = (int) (amount * 100 - dollar * 100);

        int quarter = amount2 / 25;
        System.out.print(quarter + " quarter");
        fix = (quarter > 1) ? "s" : "";
        System.out.println(fix);

        int dime = amount2 % 25 / 10;
        System.out.print(dime + " dime");
        fix = (dime > 1) ? "s" : "";
        System.out.println(fix);

        int nickel = amount2 % 25 % 10 / 5;
        System.out.println(nickel + " nickel");

        int penny = amount2 % 5 / 1;
        System.out.print(penny + " penn");
        fix = (penny > 1) ? "ies" : "y";
        System.out.println(fix);


    }
}
