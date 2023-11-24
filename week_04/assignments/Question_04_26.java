package week_04.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in dollars and cents:");
        String money = input.nextLine();
        int dollars = (money.charAt(0) - 48) * 10 + money.charAt(1) - 48;
        int quarters = (((money.charAt(3) - 48) * 10) + money.charAt(4) - 48) / 25;
        int dimes = ((money.charAt(3) - 48) * 10 + money.charAt(4) - 48) % 25 / 10;
        int nickels = ((money.charAt(3) - 48) * 10 + money.charAt(4) - 48) % 10 / 5;
        int pennies = (money.charAt(4) - 48) % 5 / 1;

        System.out.println("Equivalent in Monetary Units:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);


    }
}
