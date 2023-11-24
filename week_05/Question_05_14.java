package week_05;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        int i = 0;
        int gcd = 0;
        int last = Math.min(n1, n2);
        while (i < last) {
            i += 1;
            if (n1 % i == 0 && n2 % i == 0)   gcd=i;

        }
        System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);
    }
}
