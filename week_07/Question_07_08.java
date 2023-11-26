package week_07;

import java.util.Scanner;

public class Question_07_08 {
    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten values of double type: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextDouble();
        }
        System.out.println("The average value: "+average(array));

    }
}
