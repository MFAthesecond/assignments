package week_02;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal  and a gratuity rate:  ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();
        System.out.println("The gratuity is $" + subtotal * rate / 100 +
                " and total is $" + (subtotal + subtotal * rate / 100));
    }
}