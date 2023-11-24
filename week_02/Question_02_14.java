package week_02;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();
        System.out.println("Enter height in inches:");
        double inches = input.nextDouble();
        double kg=pounds *0.45359237;
        double meters=inches*0.0254;
        double BMI=kg/ Math.pow(meters,2);
        System.out.println("BMI is "+BMI);



    }
}
