package week_02.assignments.assignments.nia.week_03;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        double pound = 0.45359237;
        double kilograms = weight * pound;

        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Enter inches: ");
        double inches = input.nextDouble();
        double meters = (inches * 0.0254) + (feet * 0.3048);

        // one pound is 0.45359237 kilograms
        // one inch is 0.0254 meters


        double bmi = kilograms / (meters * meters);
        System.out.println("BMI is " + bmi);



        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


    }
}