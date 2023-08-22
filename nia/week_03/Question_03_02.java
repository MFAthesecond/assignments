package week_02.assignments.assignments.nia.week_03;

import java.util.Random;
import java.util.Scanner;

public class Question_03_02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(10);

        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " = ? ");
        int reply = input.nextInt();
        int answer = number1 + number2 + number3;


        if (reply == answer) {
            System.out.println("What is " + number1 + " + " + number2 + " + " +
                    number3 + " = " +  reply +  " is true ");
        } else {
            System.out.println("What is " + number1 + " + " + number2 + " + " +
                    number3 + " = " + reply + " is false ");
        }
    }
}