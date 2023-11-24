package week_05;

import java.util.Scanner;

public class Question_05_18______ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//Pattern A
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
//Pattern B
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");


        //Pattern C
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= (6 - i); j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print((i - k) + " ");
            }
            System.out.println();
        }

        // Pattern E
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 6 - i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }

    }

}

