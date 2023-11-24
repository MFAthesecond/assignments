package week_05;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double sumOfpow2 = 0;
        double n = 10;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < n; i++) {
            double user = input.nextDouble();
            sum += user;
            sumOfpow2 += user * user;
        }
        double mean = sum / 10;
        double deviation = Math.sqrt((sumOfpow2 - ((sum*sum) / n)) / (n - 1));
        System.out.println("The mean is " + mean);
        System.out.printf("The standart deviation is %.5f" , deviation);
    }
}
//1 2 3 4,5 5,6 6 7 8 9 10