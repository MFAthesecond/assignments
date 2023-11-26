package week_07;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []numbers=new int[100];
        int number;
        System.out.println("Enter ten integers between 1 and 100: ");
        for (int i = 0; i < 10; i++) {
            number=input.nextInt();
            numbers[number-1]++;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>0){
                System.out.printf("%d occurs %d times \n",i+1,numbers[i]);
            }
        }
    }
}

//1 65 8 6 5 6 6 8 9 25