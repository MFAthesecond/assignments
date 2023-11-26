package week_10.Question_10_05;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (stackOfIntegers.getSize() == 0) {
                    stackOfIntegers.push(i);
                }
                if (stackOfIntegers.peek() != i) {
                    stackOfIntegers.push(i);
                }
                number /= i;
            }
        }

        int[] array = new int[stackOfIntegers.getSize()];
        System.out.print("Decreasing order: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = stackOfIntegers.pop();
            System.out.print(array[i] + " ");
        }

        System.out.print("\nWe used (pop) method: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
