package week_05;

import java.util.Scanner;

public class Question_05_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum=0;
        for (int i = 1; i < 98; i+=2) {
            sum +=i/(i+2.0);
        }
        System.out.println("Sum of series: "+sum);

    }
}
