package week_07;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        int num;
        int sum = 0;
        int average = 0;
        System.out.print("Enter numbers and we will find how many of them below the average" +
                "if you want to quit enter a subzero number: ");
        for (int i = 1; i <= 100; i++) {
            num = input.nextInt();
            numbers[i - 1] = num;
            if (num < 0) {
                break;
            }
            sum += num;
            average = sum / i;
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (numbers[i] < 0) {
                break;
            }
            if (numbers[i] < average) {
                count++;
            }
        }
        System.out.printf("The average = %d \n%d of numbers below the average", average, count);
    }
}
//21 21 5 4 8 5 2 1 5 6 2 1 5  21 3  5 13 5 4  8 5 6 4 8 6 5 4 -1