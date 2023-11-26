package week_07;

import java.util.Scanner;

public class Question_07_10 {
    public static int indexOfSmalestElement(double[] array) {
        double min = array[0];
        int minIndex=0;
        for (int i=0;i< array.length;i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double [] array=new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i]=input.nextDouble();
        }
        System.out.println("The minimum number is "+array[indexOfSmalestElement(array)]+" index "+indexOfSmalestElement(array));
    }
}
