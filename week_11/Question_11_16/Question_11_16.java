package week_11.Question_11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> answerList = new ArrayList<>();

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            for (int i = 0; i < answerList.size(); i++) {
                if (answerList.get(i) == answer) {
                    System.out.println("You already entered " + answer);
                }
            }
            answerList.add(answer);
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");


    }
}