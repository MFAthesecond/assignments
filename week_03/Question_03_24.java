package week_03;

import java.util.Scanner;

public class Question_03_24 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int card = (int) (Math.random() * 12) + 1;
        String nick = "";

        switch (card) {
            case 1:
                nick = "Ace";
                break;
            case 11:
                nick = "Jack";
                break;
            case 12:
                nick = "Queen";
                break;
            case 13:
                nick = "King";
                break;

        }
        int family = (int) (Math.random() * 4);
        String clane = "";
        System.out.println(family);


        switch (family) {
            case 0:
            clane = "Clubs";
            break;
            case 1:
            clane = "Diamonds";
            break;
            case 2:
            clane = "Hearts";
            break;
            case 3:
            clane = "Spades";
            break;
        }

        if (card == 1 || card > 10) {
            System.out.printf("The card you picked is %s of %s", nick, clane);
        } else System.out.printf("The card you picked is %d of %s", card, clane);


    }
}
