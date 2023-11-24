package week_02;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();
        double cost = (distance / milesPerGallon) * price;
        System.out.printf("The cost of driving is %.2f" , cost);

    }
}



