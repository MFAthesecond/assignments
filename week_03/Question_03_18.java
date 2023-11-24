package week_03;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enteer the weight of the package (in pounds):");
        int pounds = input.nextInt();

        double fee = 0;

        if (pounds > 20) {
            System.out.print("The package cannot be shipped.");
        } else if (pounds <= 1) fee = 3.5;
        else if (pounds <= 3) fee = 5.5;
        else if (pounds <= 10) fee = 8.5;
        else if (pounds <= 20) fee = 10.5;


        System.out.println("Shipping cost of the package is " + (fee * pounds));


    }
}
