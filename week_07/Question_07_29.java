package week_07;

import java.util.Scanner;

public class Question_07_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] cards = new int[4];
        System.out.print("The number of picks that yields the sum of 24: ");
        int sumOfCards = 0;
        while (sumOfCards != 24) {
            sumOfCards = 0;
            for (int i = 0; i < 4; i++) {
                int card =1+ (int) (Math.random() * 13);
                cards[i] = card-1;
                sumOfCards += card;
            }
        }
        for (int card : cards) {
            String cardNumber = switch (card % 13) {
                case 0 -> "Ace";
                case 10 -> "Jack";
                case 11 -> "Queen";
                case 12 -> "King";
                default -> "" + ((card % 13) + 1);
            };
            System.out.print(cardNumber+" ");
        }
    }
}

