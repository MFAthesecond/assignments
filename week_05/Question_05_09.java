package week_05;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int maxScore = 0;
        String maxScorer = "";
        String secondScorer = "";
        String name = "";
        int secondScore = 0;

        for (int i = 1; i < number + 1; i++) {
            System.out.printf("Student %s ", i);

            System.out.print("\n\tName: ");
            name = input.next();
            System.out.print("\tScore: ");
            int score = input.nextInt();
            if (score > maxScore) {
                maxScorer = name;
                secondScore = maxScore;
                maxScore = score;
            } else if (score > secondScore) {
                secondScorer = name;
                secondScore = score;

            }

        }
        System.out.println("Student with the highest score:" + maxScorer);
        System.out.println("Student with the second highest score:" + secondScorer);
    }
}