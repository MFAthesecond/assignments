package week_05;

import java.util.Scanner;

public class Question_05_44____bitmedi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 5; // The integer you want to convert
        //   short bits16 = (short) ((number >> 16) & 0xFFFF);


        short bits16 = (short) number;
        System.out.println(bits16);
    }
}
