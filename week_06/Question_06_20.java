package week_06;

import java.util.Scanner;

public class Question_06_20 {
    public static int countLetters(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user= input.nextLine();

        System.out.printf("The number of letters in the string \"%s\": %d",user,countLetters(user));
    }
}
