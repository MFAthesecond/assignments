package week_03;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = input.nextInt();

        int flag = 0;

        if (number % 5 == 0) flag++;
        if (number % 6 == 0) flag++;

        System.out.printf("Is %d divisible by 5 and 6? %b",number,(flag==2));
        System.out.printf("\nIs %d divisible by 5 or 6? %b",number,(flag==1));
        System.out.printf("\nIs %d divisible by 5 or 6, but not both? %b",number,(flag==1));



    }
}
