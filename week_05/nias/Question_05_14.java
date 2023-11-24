package week_05.nias;

import java.util.Scanner;

public class Question_05_14 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer : ");
        int n2 = input.nextInt();
        int d = 0;
        int gcd = 0;
        int min = Math.min(n1, n2);
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("The greatest common divisor for %d and %d is %d",n1,n2,gcd );
    }
}