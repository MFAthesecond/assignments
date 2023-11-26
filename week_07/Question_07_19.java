package week_07;

import java.util.Scanner;

public class Question_07_19 {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter list: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        if (isSorted(array)) {
            System.out.println("The list is sorted");
        } else  System.out.println("The list is not sorted");
    }
}
