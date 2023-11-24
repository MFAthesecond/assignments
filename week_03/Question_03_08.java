package week_03;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int temp;

        if (first > second) {
            temp = second;
            second = first;
            first = temp;
        }

        if (second > third) {
            temp = third;
            third = second;
            second = temp;
        }


        if (first > second) {
            temp = second;
            second = first;
            first = temp;
        }


        System.out.printf("%d < %d < %d", first, second, third);
    }
}
