package week_05;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String user = input.nextLine();
        int count = 0;

        for (int i = 0; i < user.length(); i++) {
            if (user.charAt(i) < 91 && user.charAt(i) > 64) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is "+count);

    }
}
