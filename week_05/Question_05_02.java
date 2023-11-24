package week_05;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sum = "";
        int count = 0;
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 15);
            int y = (int) (Math.random() * 15);
            System.out.printf("What is %d + %d? ", x, y);
            int user = input.nextInt();
            String trueOrNot = "";
            if (x + y == user) {
                System.out.println("You are correct! ");
                count++;
                trueOrNot = " true ";
            } else {
                System.out.printf("%d + %d should be %d ", x, y, user);
                trueOrNot = " wrong ";
            }
            sum += x + " + " + y + " = " + user + trueOrNot;
        }
        double totalTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Correct count is " + count);
        System.out.printf("Test time is %.0f seconds ", totalTime);
    }
}
