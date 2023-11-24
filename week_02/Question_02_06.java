package week_02;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int sum = 0;
        sum += num % 10;
        sum += num / 10 % 10;
        sum += num / 100 % 10;

        System.out.println("The sum of the digits is " + sum);
    }
}
