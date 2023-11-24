package week_05.nias;

import java.util.Scanner;

public class Question_05_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int number = 100; number <= 200; number++) {

            if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {

                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();


                }
            }
        }
    }
}

