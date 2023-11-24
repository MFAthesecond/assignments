package week_05;

import java.util.Scanner;

public class Question_05_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i * i * i < 12000) {
            i += 1;
        }
        System.out.println("The largest n is " + i);
    }
}
