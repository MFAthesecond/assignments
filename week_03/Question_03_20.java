package week_03;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int windSpeed = input.nextInt();

        if (temp < -58 || temp > 41 ) {
            System.out.println("The temperature is invalid.");

        } else if ( windSpeed < 2) {
            System.out.println("The windspeed is invalid.");
        } else {
            double vToPow16 = Math.pow(windSpeed, 0.16);

            double twc = 35.74 + 0.6215 * temp - 35.75 * vToPow16 + 0.4275 * temp * vToPow16;
            System.out.println("The wind chill index is " + twc);
        }
    }

}
