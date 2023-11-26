package week_07;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Question_07_32 {
    public static int partition(int[] list) {
        int[] sorted = Arrays.copyOf(list, list.length);
        Arrays.sort(sorted);

        return list[list.length / 2];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int mid = partition(list);
        System.out.println(mid);
        int[] parted = new int[list.length];
        parted[parted.length / 2] = mid;
        for (int i = 0, sCount = 1, bCount = 0; i < list.length; i++) {
            if (list[i] > mid) {
                parted[list.length / 2 + sCount] = list[i];
                parted[list.length / 2 + sCount] = list[i];
                sCount++;
            }
            if (list[i] < mid) {
                parted[bCount] = list[i];
                bCount++;
            }
        }
        System.out.println(Arrays.toString(parted));
    }
}
