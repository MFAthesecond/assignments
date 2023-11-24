package week_05;

import java.util.Scanner;

public class Question_05_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = '!';
        int last = '~';
        int count = 0;
        for (int i = first; i < last; i++) {
            System.out.print("\s"+(char) i);

            count++;
            if (count % 10 == 0) {
                System.out.println();
            }


        }
    }
}
