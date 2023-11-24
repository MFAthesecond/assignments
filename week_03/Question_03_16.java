package week_03;

import java.util.Scanner;

public class Question_03_16 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Random coordinate in rectangle centered at (0,0) " +
                "with width 100 and height 200:");
        int cor1=(int)((Math.random()*101)-50);
        int cor2=(int)((Math.random()*101)-50);

        System.out.printf("( %d, %d )",cor1,cor2);

    }
}
