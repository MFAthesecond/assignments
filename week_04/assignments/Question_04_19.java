package week_04.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer");
        String isbn = input.next();
        int d1 = isbn.charAt(0) - 48;
        int d2 = isbn.charAt(1) - 48;
        int d3 = isbn.charAt(2) - 48;
        int d4 = isbn.charAt(3) - 48;
        int d5 = isbn.charAt(4) - 48;
        int d6 = isbn.charAt(5) - 48;
        int d7 = isbn.charAt(6) - 48;
        int d8 = isbn.charAt(7) - 48;
        int d9 = isbn.charAt(8) - 48;

        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.print("The ISBN-10 number is " + isbn);



        if (d10 == 10) System.out.println("X");
        else System.out.println(d10);
        System.out.println((d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9));
    }
}
