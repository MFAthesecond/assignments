package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static int[] selectionSort(int[] list) {
        for (int i = list.length-1; i >=0; i--) {
            // Find the minimum in the list[i..list.length-1]
            int currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >=0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter list: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(array)));

    }
}
