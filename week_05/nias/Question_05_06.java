package week_05.nias;

import java.util.Scanner;

public class Question_05_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Miles              Kilometers  |  Kilometers              Miles");
        for (int i = 1; i <= 10; i++) {
            double kilometers = i * 1.609;


            for (int j = 20; j < 66; j+=5) {
                double miles = j / 1.609;
                System.out.printf("\n%d              %.3f  |  %d              %.3f", i, kilometers,j,miles);

            }

        }

    }
}