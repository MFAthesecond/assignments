package week_06;

import java.util.Scanner;

public class Question_06_02 {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int user = input.nextInt();

        System.out.printf("The sum of digits in %d is %d",user,sumDigits(user));
    }
}
