package week_07;

import java.util.Scanner;

public class Question_07_14 {
    public static int min(int[] array) {
        int min = array[0];
        for (int v : array) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static int gcd(int[] numbers) {
        int gcd = 1;
        int num = 1;
        int min = min(numbers);
        while (gcd < min) {
            int count = 0;
            for (int number : numbers) {
                if (number % num == 0) {
                    count++;
                }
                if (count == numbers.length) {
                    gcd = num;
                }
            }
            num++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(array));
    }
}
//5 10 15 20 25