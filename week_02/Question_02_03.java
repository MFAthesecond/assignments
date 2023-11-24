package week_02;

import java.util.Scanner;

public class Question_02_03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet ");
        double f_value = input.nextDouble();
        double m_value = f_value * 305 / 1000;
        System.out.println(f_value + " feet is " + m_value + " meters.");


    }
}
