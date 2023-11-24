package week_02;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double mass = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double i_temp = input.nextDouble();
        System.out.println("Enter the final temperature:");
        double f_temp = input.nextDouble();
        double Q = mass * (f_temp - i_temp) * 4184;
        System.out.println("The energy needed is "+Q);

    }
}
