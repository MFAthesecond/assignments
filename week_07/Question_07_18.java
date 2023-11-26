package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
            }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
