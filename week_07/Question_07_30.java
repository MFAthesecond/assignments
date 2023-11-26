package week_07;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    private static boolean isConsecutiveFour(int[] values) {
        int count = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                count++;
            } else count = 1;
        }
        return count >= 4;
    }
}
