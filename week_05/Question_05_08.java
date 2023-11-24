package week_05;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number = input.nextInt();
        int maxScore = 0;
        String maxScorer = "";
        String name = "";

        System.out.println("Enter each student's name and score");
        for (int i = 1; i < number + 1; i++) {
            System.out.printf("Student %s ", i);

            System.out.print("\n\tName: ");
            name = input.next();
            System.out.print("\tScore: ");
            int score = input.nextInt();
            if (score > maxScore) {
              //  maxScore = score;
                maxScorer = name;
            }
            System.out.println("Student with the highest score:"+maxScorer);
            }
        }
    }

