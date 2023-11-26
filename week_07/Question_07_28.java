package week_07;

import java.util.Scanner;
public class Question_07_28 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i!=j){
                    System.out.println(numbers[i] + " " + numbers[j] + "\n");
                }
            }
        }
    }
}
