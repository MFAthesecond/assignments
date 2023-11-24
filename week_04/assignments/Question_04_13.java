package week_04.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String a = input.next();
        String x = a.toLowerCase();

        char value = x.charAt(0);
        if ((value > 64 && value < 91) || (value > 96 && value < 123)) {
            if (value == 'a' || value == 'e' || value == 'i' || value == 'u' || value == 'o') {
                System.out.printf("%s is a vowel", a);
            } else System.out.printf("%s is a consonant", a);
        } else System.out.printf("%s is an invalid input", a);


    }
}