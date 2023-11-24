package week_02;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int minsyear = 60 * 60 * 24 * 365;
        int yearlyAddition = minsyear / 7 + minsyear / 45 - minsyear / 13;
        System.out.println("Enter the numner of years: ");
        int years = input.nextInt();
        int currentPopulation = 312032486;
        int lastPopulation = currentPopulation + years * yearlyAddition;
        System.out.println("The population in " + years + " years is " + lastPopulation);


    }
}
