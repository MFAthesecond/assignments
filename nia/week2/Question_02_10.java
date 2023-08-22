package week_02.assignments.assignments.nia;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms : ");
        double waterKilograms = input.nextDouble();
        // suyun kg cinsinden ağırlı M ile gösterilir.

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature : ");
        double finalTemperature = input.nextDouble();

        double Q = waterKilograms * (finalTemperature - initialTemperature) * 4184;
        //  joule Q ile gösterilir.


        System.out.println("The energy needed is  " + Q);


    }
}




