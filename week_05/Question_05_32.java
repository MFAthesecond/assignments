package week_05;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (two distinct digits): ");
        int user = input.nextInt();
        int u1=user/10;
        int u2=user%10;

        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);

        while (n1 == n2) {
            n2 = (int) Math.random() * 10;
            System.out.println("a");
        }
        System.out.println("The lottery number is "+n1+n2);
        if (n1==u1&&n2==u2){
            System.out.println("You find the lottery number: you win $10,000");
        } else if (n1==u2&&n2==u1) {
            System.out.println("You find the numbers but in wrong order still you win $3,000");
        } else if (n1==u2||n2==u1) {
            System.out.println("Match one digit: you win $1,000");
        }else System.out.println("Sorry, no match");
    }
}
