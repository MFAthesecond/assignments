package week_05;

import java.util.Scanner;

public class Question_05_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tuition = 10000;
        int sum = 0;

        for (int i = 0; i < 14; i++) {
            tuition *= 1.05;
            if (i == 10) {
                System.out.println("Tuition in ten years: $" + tuition);
            }
            if (i>=10){
                sum+=tuition;
            }
        }
        System.out.println("Total cost for four years' worth of tuition after the tenth year: $"+ sum);
    }
}
