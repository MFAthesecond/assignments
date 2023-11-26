package week_07;

import java.util.Scanner;

public class Question_07_11 {
    public static double mean(double[] array) {
        double sum=0;
        for (double i:array) {
            sum+=i;
        }return sum/array.length;
    }


        public static double deviation ( double[] array){
            double sum=0;
            double mean=mean(array);
            for (double i:array) {
                sum+=(Math.pow(i+mean,2));
            }return Math.sqrt(sum/array.length-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.println("The mean is: " + mean(array));
        System.out.println("The standard deviation is "+deviation(array));
    }
}
