package week_06;

import java.util.Scanner;

public class Question_06_18 {


    public static boolean isValidLength(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    public static boolean isValidCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))) {

            } else return false;
        }
        return true;
    }

    public static boolean isEnoughDigit(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
                if (count == 2) {
                    return true;
                }

            }
        }return false;
    }


    public static void isValidPassword(String password) {
        if (isValidLength(password) && isEnoughDigit(password) && isValidCharacters(password)) {
            System.out.println("Valid password");
        } else System.out.println("Invalid password");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        isValidPassword(input.nextLine());
    }

}


