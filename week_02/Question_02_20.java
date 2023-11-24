package week_02;

import java.util.Scanner;

public class Question_02_20 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /*

         */
        System.out.print("Enter balance and interest rate:");
        double balance= input.nextDouble();
        double intRate= input.nextDouble();

        double interest= balance *(intRate/1200);

        System.out.println("The interest is "+ interest);


        System.out.printf("The interest is: %.3f",interest);





    }
}

