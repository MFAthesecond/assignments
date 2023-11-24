package week_02;

import java.util.Scanner;
import java.util.SortedMap;

public class Question_02_22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount as integer for use as currency: ");
        int money   = input.nextInt();
        int dollars = money / 100;
        int quarter = (money % 100) / 25;
        int dimes   = (money % 25) / 10;
        int nickles = (money % 10) / 5;
        int pennies = money % 5 / 1;

        System.out.println("Your amount " + money + " consist of ");
        System.out.println(dollars + " dolars");
        System.out.println(quarter + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");


    }
}
