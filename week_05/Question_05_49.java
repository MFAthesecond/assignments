package week_05;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user = input.nextLine().toUpperCase();
        System.out.println(user);
        int count = 0;
        int letterCount = 0;

        for (int i = 0; i < user.length(); i++) {
            char letter = user.charAt(i);

            if (letter < 91 && letter > 64 || letter == 304) {
                letterCount++;
                if (letter == 'A' || letter == 'I' || letter == 'İ' || letter == 'E' || letter == 'O' || letter == 'U') {
                    count++;
                }
            }
        }
        System.out.println("The number of vowels is " + count);
        System.out.println("The number of consonants is " + (letterCount - count));
    }
}