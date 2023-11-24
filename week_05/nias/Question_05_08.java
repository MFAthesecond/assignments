package week_05.nias;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter each student's name and score");

        int maxScore = 0;
        String maxScorer = " ";


        for (int i = 1; i < numberOfStudents + 1; i++) {
            System.out.printf("\nStudent: %d ", i);


            System.out.print("\nName: ");
            String name = input.next();

            System.out.print("Score : ");
            int score = input.nextInt();

            if (score > maxScore) {
                maxScore = score;
                maxScorer = name;

            }
            System.out.println("Student with the highest score:" + maxScorer);




        }

    }
}
