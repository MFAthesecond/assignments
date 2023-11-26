package week_07;

import java.util.Scanner;

public class Question_07_26 {
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
        if (list1.length == list2.length) {
            int count = 0;
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    count++;
                    System.out.println("Two lists are not strictly identical");
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Two lists are strictly identical");
            }
        } else System.out.println("Two lists are not strictly identical");
    }
}
