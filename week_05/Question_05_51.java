package week_05;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string:");
        String s1 = input.nextLine();
        System.out.print("Enter the second string:");
        String s2 = input.nextLine();
        String common="";

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                common+=s1.charAt(i);
            }
        }
        System.out.println("The common prefix is "+common);

    }
}
