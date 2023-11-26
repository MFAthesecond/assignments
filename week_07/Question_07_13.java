package week_07;

import java.util.Scanner;

public class Question_07_13 {
    public static int getRandom(int[] numbers) {
        int random = (int) (Math.random() * 55);
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int) (Math.random() * 55);
                i = 0;
            }
        }
        return random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Number generated: "+getRandom(array));
    }
}
