package week_03;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yor lottery pick (three digits):");
        int guess = input.nextInt();

        int g1 = guess / 100;
        int g2 = (guess / 10) % 10;
        int g3 = guess % 10;

        int lottery = (int) (Math.random() * 1000);
        int l1 = lottery / 100;
        int l2 = (lottery / 10) % 10;
        int l3 = lottery % 10;

        String lotStr = "";

        if (lottery < 100) {
            lotStr += "0";
            if (lottery < 10) {
                lotStr += "0";
                if (lottery < 1)
                    lotStr += "0";
            }
        }

        System.out.println("Lottery number is " + lotStr+lottery);

        int sameNumber = 0;

        if (g1 == l1 || g1 == l2 || g1 == l3)
        {
            sameNumber++;
        }
        if (g2 == l1 || g2 == l2 || g2 == l3)
        {
            sameNumber++;
        }
        if (g3 == l1 || g3 == l2 || g3 == l3)
        {
            sameNumber++;
        }

        if (guess + lottery == guess * 2) {
            System.out.println("You won the lottery!!!!!!   10,000$ Prize!!!!!!");
        } else if (sameNumber == 3) {
            System.out.println("Matched three number!!! 3,000$ Prize!!! ");
        } else if (sameNumber > 0) {
            System.out.println("Matched one number!!! 1,000$ Prize!!! ");
        } else System.out.println("Sorry no match :(");






    }
}
