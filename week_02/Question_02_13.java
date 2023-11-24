package week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double amount = input.nextDouble();
        double interest = 1 + 0.00417;
        double sum = amount * interest;
        System.out.println(sum);
        // sum = (100+sum)*interest;
        System.out.println(sum);
        // sum = (100+sum)*interest;
        System.out.println(sum);
        // sum = (100+sum)*interest;
        System.out.println(sum);
        //sum = (100+sum)*interest;
        System.out.println(sum);
        // sum = (100+sum)*interest;
        //System.out.println(sum);
        System.out.println("After six month, the account value is $" + sum);


    }
}