package week_05;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0:");
        int i = input.nextInt();
        double sum = 0;
        int count = 0;
        int neg = 0;


        while (i != 0) {
            sum += i;
            i = input.nextInt();
            count++;
            if (i < 0) {
                neg++;
            }
        }
        System.out.printf("\nThe number of positives is %d ", (count - neg));
        System.out.printf("\nThe number of negatives is %d ", neg);
        System.out.printf("\nThe total is %.2f ", sum);
        System.out.printf("\nThe average is %.2f ", (sum / count));

    }
}
