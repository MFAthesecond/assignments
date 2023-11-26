package week_07;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        int num=0;
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num=input.nextInt();
            if (numbers[num] == 0) {
                numbers[num]++;
                count++;
            }
        }
        System.out.println("The number of distinct number is "+count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]>0){
            System.out.print(i+" ");
        }
    }}
}
//1 5 8 6 8 6 5 4 8 6