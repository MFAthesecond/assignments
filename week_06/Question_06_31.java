package week_06;

import java.util.Scanner;

public class Question_06_31 {
    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(String number) {
        if (
                prefixMatched(number, (Integer.valueOf(number.charAt(0)) - '0')) &&
                        ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) &&
                        getSize(number) > 12 || getSize(number) < 17){
            return true;
        }
        return false;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        number *= 2;
        if (number >= 10) {
            number = number % 10 + number / 10;
        }
        return number;
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfOddPlace(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i += 2) {
            sum += getDigit(Character.valueOf(number.charAt(i)) - '0');
        }
        return sum;
    }


    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfDoubleEvenPlace(String number) {
        int sum = 0;
        for (int i = number.length() - 1; i > 0; i -= 2) {
            sum += (Character.valueOf(number.charAt(i)) - '0');
        }
        return sum;
    }

    /**
     * Return true if the digit d is a pre�x for number
     */
    public static boolean prefixMatched(String number, int d) {
        int firstDigit = Integer.valueOf((number.charAt(0)) - '0');
        if (firstDigit == 3 || firstDigit == d || firstDigit == d || firstDigit == d) {
            if (firstDigit == 3) {
                firstDigit = Integer.valueOf(number.substring(0, 2));
                return true;
            }
            return true;
        }
        return false;
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(String number) {
        int size = number.length();
        return size;
    }


    /**
     * Return the �rst k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        String cardNumber = input.next();
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else System.out.println(cardNumber + " is invalid");
    }
}