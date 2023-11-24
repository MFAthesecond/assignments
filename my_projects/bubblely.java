package my_projects;

import java.util.Arrays;
import java.util.Scanner;

public class bubblely {
    public static void bubbleSort(double[] array) {
        int count=0;
        int swapCounter = 1;
        while (swapCounter != 0) {
            swapCounter = 0;
            for (int j = 0; j < array.length -1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCounter++;
                }
            }
        }System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[1000];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 1000; i++) {
            array[i] = input.nextDouble();
        }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
