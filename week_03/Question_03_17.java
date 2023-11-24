package week_03;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock(1), paper(2):");
        int user = input.nextInt();

        int ai = (int) (Math.random() * 3);


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

        if (user == ai) System.out.print("\b too. It is a draw.");
        else if (user == ai + 1 || user == ai - 2) {
            System.out.print("You won.");
        } else System.out.print("Computer won.");


    }
}
