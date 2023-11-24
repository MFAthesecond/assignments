package week_02;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F");
        double temp = input.nextDouble();
        System.out.println("Enter the wind speed (>2) in miles per hour");
        double speed = input.nextDouble();
        double index = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
        System.out.println("the wind chill index is " + index);


    }
}
