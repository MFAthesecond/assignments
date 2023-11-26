package week_06;

import java.util.Scanner;

public class Question_06_37 {
    public static String format(int number, int width) {
String strNumber=String.valueOf(number);
        for (int i = strNumber.length(); i < width; i++) {
            strNumber="0"+strNumber;
        }return strNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.println(format(number, width));
    }
}
