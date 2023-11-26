package week_07;

import java.util.Scanner;

public class Question_07_12 {
    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        for (int i : reverse(array)) {
            System.out.print(i + " ");
        }
    }
}
//2 15 6 5 1 4 54 7 8 5
