package week_06;

import java.util.Scanner;

public class Question_06_21 {
    public static int getNumber(char lowercaseLetter) {
        int number = 0;
        if (lowercaseLetter == 'a' || lowercaseLetter == 'b' || lowercaseLetter == 'c') {
            number = 2;
        } else if (lowercaseLetter == 'd' || lowercaseLetter == 'e' || lowercaseLetter == 'f') {
            number = 3;
        } else if (lowercaseLetter == 'g' || lowercaseLetter == 'h' || lowercaseLetter == 'i') {
            number = 4;
        } else if (lowercaseLetter == 'j' || lowercaseLetter == 'k' || lowercaseLetter == 'l') {
            number = 5;
        } else if (lowercaseLetter == 'm' || lowercaseLetter == 'n' || lowercaseLetter == 'o') {
            number = 6;
        } else if (lowercaseLetter == 'p' || lowercaseLetter == 'q' || lowercaseLetter == 'r' || lowercaseLetter == 's') {
            number = 7;
        } else if (lowercaseLetter == 't' || lowercaseLetter == 'u' || lowercaseLetter == 'v') {
            number = (8);
        } else if (lowercaseLetter == 'w' || lowercaseLetter == 'x' || lowercaseLetter == 'y' || lowercaseLetter == 'z') {
            number = 9;
        } else if (lowercaseLetter == '_' || lowercaseLetter == ',' || lowercaseLetter == '@') {
            number = 1;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user= input.nextLine();
   //     String a=user.

        for (int i = 0; i < user.length(); i++) {
            if (Character.isLetter(user.charAt(i))){
                System.out.print(getNumber(user.toLowerCase().charAt(i)));
            }else System.out.print(user.charAt(i));
        }
    }
}
