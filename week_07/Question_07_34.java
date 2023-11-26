package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String user = input.nextLine();
        String sorted = sort(user.toLowerCase());
        System.out.println("Sorted string: " + sorted);
    }

    private static String sort(String user) {
        StringBuilder sortingen = new StringBuilder();
        char[] sorted = new char[user.length()];
        for (int i = 0; i < user.length(); i++) {
            sorted[i] = user.charAt(i);
        }
        Arrays.sort(sorted);
        for (char c : sorted) {
            sortingen.append(c);
        }
        return sortingen.toString();
    }
}
