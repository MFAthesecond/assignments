package week_02;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds:  ");
        double pound = input.nextDouble();
        System.out.println(pound + " pounds is " + (pound * 454 / 1000) + " kilograms");

    }
}
