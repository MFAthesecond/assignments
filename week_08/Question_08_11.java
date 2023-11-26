package week_08;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        int[] binary = findBinaryForm(number);
        displayHeadAndTailsForm(binary);
    }

    private static void displayHeadAndTailsForm(int[] binary) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print(binary[i] == 0 ? "H " : "T " );
        }
    }

    private static int[] findBinaryForm(int number) {
        int[] binary = new int[9];
        for (int i = binary.length - 1; i >= 0; i--) {
            binary[i] = number % 2;
            number /= 2;
        }
        return binary;
    }


}
