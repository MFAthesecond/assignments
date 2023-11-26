package week_06;

import java.util.Scanner;

public class Question_06_03 {
    public static String reverse(String number) {
        String sNumber = "" + number;
        String reversed = "";
        for (int i = sNumber.length() - 1; i >= 0; i--) {
            reversed += sNumber.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String number) {

        return number.equals(reverse(number));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String number = input.nextLine();

        String is = (isPalindrome(number)) ? "\b" : "not";
        System.out.printf("%s is %s a palindrome.", number, is);
    }
}
