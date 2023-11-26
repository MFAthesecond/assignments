package week_07;

import java.util.Scanner;

public class Question_07_27 {
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            int count = 0;
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    count++;
                    return false;
                }
            }
        } else return false;
        return true;
    }

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
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else System.out.println("Two lists are not strictly identical");
    }
}
