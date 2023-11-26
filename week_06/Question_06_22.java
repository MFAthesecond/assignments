package week_06;

import java.util.Scanner;

public class Question_06_22 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();
        double x = sqrt(n);
        System.out.printf("The approximated square root of %d is: %.1f", n, x);
    }

    public static int sqrt(long n) {
        double nextGuess = 0;
        double lastGuess = n/2;
        while (lastGuess*lastGuess-n > 0.001) {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            lastGuess = nextGuess;
        }
        return (int) lastGuess;
    }
}