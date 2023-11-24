package week_04.assignments;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String s1 = input.nextLine();
        System.out.println("Enter string 2:");
        String s2 = input.nextLine();

        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else if (s2.contains(s1)) {
            System.out.printf("%s is a substring of %s", s1, s2);
        } else System.out.printf("%s is not a substring of %s", s1, s2);

    }
}
