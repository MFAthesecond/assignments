package week_04.assignments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");
        String x = input.nextLine();
        char c = x.charAt(0);
        int code = c;

        System.out.printf("The unicode for the character %c is %d",c,code);


    }
}

