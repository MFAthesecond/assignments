package week_03;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = (int) ((Math.random() * ((10 - 1) + 1)));
        int b = (int) ((Math.random() * ((10 - 1) + 1)));
        int c = (int) ((Math.random() * ((10 - 1) + 1)));


        System.out.printf("What is %d + %d + %d = ? ", a, b, c);
        int i = input.nextInt();
        System.out.println();

        System.out.printf("%d + %d + %d = %d", a, b, c,i);
        if (a + b + c != i) System.out.println(" is false");
        else System.out.println(" is true");


    }
}