package week_04.assignments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code:");
        int ascii = input.nextInt();

        char x = (char) ascii;

        System.out.printf("\nThe character for ASCII code %d is %c",ascii,x);

    }
}
