package week_05.nias;

import java.util.Scanner;

public class Question_05_05_İlertek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 201; i +=2) {

            for (int j = 20; j < 516; j += 5) {


                double pound = i * 2.2;
                double kilograms = j * 0.45359237;
                System.out.printf("\n%d                    %.1f  |   %d                    %.2f   ", i, pound, j, kilograms);

            }
        }


    }

}
