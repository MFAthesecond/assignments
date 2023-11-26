package week_07;

import java.util.Scanner;

public class Question_07_15 {
    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminated = new int[10];
        for (int i = 0; i < list.length; i++) {
            if (eliminated[list[i]] == 0) {
                eliminated[list[i]]++;
            }
        }
        return eliminated;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();


        }
        int[] eliminated = eliminateDuplicates(numbers);

        System.out.print("The duplicated numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (eliminated[i] == 1) {
                System.out.print(" " + (i));
            }
        }
    }
}
