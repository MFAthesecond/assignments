package week_12.question_12_07;

import week_12.question_12_09.BinaryFormatException;

import java.util.Scanner;

public class bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();
        try {
            System.out.println("The decimal value for binary number " + binaryString + " is " + binaryToDecimal(binaryString));
        } catch (BinaryFormatException ex) {
            System.out.println(ex.toString());
        }
    }

    private static int binaryToDecimal(String binaryString) throws BinaryFormatException {
        int number = 0;
        int digit = 1;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                number += binaryCharToDecimal(binaryString.charAt(i), digit);
                digit *= 2;
            }
            return number;
    }

    private static int binaryCharToDecimal(char c, int i) throws BinaryFormatException {
        int number = (int) c - 48;
        if (number != 0 && number != 1) {
            throw new BinaryFormatException();
        }
        return number * i;
    }
}
