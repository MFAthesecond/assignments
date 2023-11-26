package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        int[] mergedList = merge(list1, list2);
        for (int x : mergedList) {
            System.out.print(x + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            merged[i] = list1[i];
        }
        for (int i = list1.length; i < merged.length; i++) {
            merged[i] = list2[(i - list1.length)];
        }
        Arrays.sort(merged);
        return merged;
    }
}
//5 1 5 16 61 111
//4 2 4 5 6