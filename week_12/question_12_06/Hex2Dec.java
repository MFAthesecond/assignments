package week_12.question_12_06;

import week_12.question_12_08.HexFormatException;

import java.util.Scanner;

public class Hex2Dec {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {;
            System.out.println(ex.toString());
        }
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws NumberFormatException {
        if (ch > 'F') throw new HexFormatException();
        if (ch >= 'A')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'1
            return ch - '0';


    }
}
