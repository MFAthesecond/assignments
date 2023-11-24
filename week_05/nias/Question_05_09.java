package week_05.nias;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter each student's name and score");

        int maxScore = 0;
        String maxScorer = " ";
        String second = " ";


        for (int i = 1; i < numberOfStudents + 1; i++) {
            System.out.printf("\nStudent: %d ", i);


            System.out.print("\nName: ");
            String name = input.next();

            System.out.print("Score : ");
            int score = input.nextInt();

            if (score > maxScore) {
                second=maxScorer;
                maxScorer = name;
            }
            System.out.println("The highest scoring student:" + maxScorer);
            System.out.println("The second highest scoring student:" + second);


        }

    }
}

