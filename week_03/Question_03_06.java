package week_03;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds:");
        int pound = input.nextInt();

        System.out.print("Enter feet:");
        int feet = input.nextInt();

        System.out.print("Enter inches:");
        int inch = input.nextInt();

        double kilo = pound * 0.45359237;
        double meter = (feet*12 +inch) * 0.0254;

        double bmi = kilo/(meter*meter);

        System.out.println("BMI is "+ bmi);

        if (bmi<18.5) System.out.println("Underweight");
        else if (bmi<25.0) System.out.println("Normal");
        else if (bmi<30.0) System.out.println("Overweight");
        else  System.out.println("Obese");





    }
}
