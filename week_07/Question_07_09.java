package week_07;

import java.util.Scanner;

public class Question_07_09 {
    public static double min(double[] array) {
        double min = array[0];
        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(array));
    }
}
//2,1 2,5 6,3 5,4 1,2 4,5 4 7 8 5