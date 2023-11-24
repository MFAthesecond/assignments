package week_04.assignments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit:");
        String i = input.next();
        int value = i.charAt(0) - 48;
        if (value < 21&& value > 16) {
            value -= 7;
        }
        if (value<17) {
            int v1 = value % 2;
            int v2 = (value / 2) % 2;
            int v3 = (value / 4) % 2;
            int v4 = (value / 8) % 2;
        System.out.println("The binary value is " + v4 + v3 + v2 + v1);
    }   else System.out.printf("%s is an invalid input",i);

    }///binary hesaplama olayına bakılacak
}
