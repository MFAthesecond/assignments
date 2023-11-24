package week_05;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);



        int ai;
        int userScore = 0;
        int AIScore = 0;

        while (Math.abs(userScore - AIScore )!= 2) {
            System.out.print("scissor (0), rock(1), paper(2):");
            int user = input.nextInt();
            ai = (int) (Math.random() * 3);
            switch (ai) {
                case 0:
                    System.out.print("The computer is scissor.");
                    break;
                case 1:
                    System.out.print("The computer is rock.");
                    break;
                case 2:
                    System.out.print("The computer is paper.");
                    break;
            }
            switch (user) {
                case 0:
                    System.out.print("You are scissor.");
                    break;
                case 1:
                    System.out.print("You are rock.");
                    break;
                case 2:
                    System.out.print("You are paper.");
                    break;
            }

            if (user == ai) {
                System.out.println("\b too. It is a draw.");
                continue;
            } else if (user == ai + 1 || user == ai - 2) {
                System.out.print("You won.");
                userScore++;
            } else {
                System.out.print("Computer won.");
                AIScore++;
            }
            System.out.println("\nComputer wins: " + AIScore);
            System.out.println("User wins: " + userScore);
        }
    }
}
