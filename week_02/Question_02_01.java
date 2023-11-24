package week_02;

import java.util.Scanner;

public class Question_02_01 {


    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celcius: ");
        double c_degree = input.nextDouble();
        double f_degree = (9 / 5) * c_degree + 32;

        System.out.println(c_degree + "  Celcius is " + f_degree + " Fahrenheit.");

    }
}
