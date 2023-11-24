package week_04.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_04_15 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter:");
        char letter = input.next().toLowerCase().charAt(0);
        int number = 0;

        if (letter == 'a' || letter == 'b' || letter == 'c') {
            number = 2;
        } else if (letter == 'd' || letter == 'e' || letter == 'f') {
            number = 3;
        } else if (letter == 'g' || letter == 'h' || letter == 'i') {
            number = 4;
        } else if (letter == 'j' || letter == 'k' || letter == 'l') {
            number = 5;
        } else if (letter == 'm' || letter == 'n' || letter == 'o') {
            number = 6;
        } else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            number = 7;
        } else if (letter == 't' || letter == 'u' || letter == 'v') {
            number = (8);
        } else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            number = 9;
        } else if (letter == '_' || letter == ',' || letter == '@') {
            number = 1;
        } else if (letter == ' ') {
            number = '*';
        }
        if (number == 0) {
            System.out.println("%c is an invalid input");
        } else System.out.println("The corresponding number is " + number);
    }
}
