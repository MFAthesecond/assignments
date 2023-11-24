package week_05.nias;

import java.util.Scanner;

public class Question_05_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /** ilk önce yılların %5 ile n ekadar olduğunu bul
         *
         * 10. yıl ücretini
         * sonraki 4 yılın giderlerinin toplamını istiyor
         *
         */

        int tuition = 10000;
        double sum = 0;


        for (int year = 1; year < 15; year++) {
            tuition += (int) tuition * 0.05;
            if (year == 10) {
                System.out.printf("Tuition in ten years: $%d ", tuition);
            }

            for (int i = 11; i <= 14; i++) {
                //burası tuition her yıl toplanması gerek
                //bu yıllar arasındaki
                sum += tuition;


            }

        }
        System.out.println("\nTotal cost for four years worth of tuition after the tenth year: $" + sum);

    }

}

