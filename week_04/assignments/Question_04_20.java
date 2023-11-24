package week_04.assignments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String message = input.nextLine();

        System.out.println("Length of the string: "+message.length());
        System.out.println("First character of the string: "+message.charAt(0));

    }
}
