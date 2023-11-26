package week_07;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100:");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[numbers.length - i-1] = input.nextInt();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
