package week_07;

public class Question_07_24 {
    public static void main(String[] args) {
        boolean[] suits = new boolean[4];
        int picks = 0;

        while (true) {
            int count = 0;
            String cardNumber;
            String suit = "";
            int card = (int) (Math.random() * 52);
            picks++;
            if (!suits[card / 13]) {
                suits[card / 13] = true;
                cardNumber = switch (card % 13) {
                    case 0 -> "Ace";
                    case 10 -> "Jack";
                    case 11 -> "Queen";
                    case 12 -> "King";
                    default -> "" + ((card % 13) + 1);
                };
                switch (card / 13) {
                    case 0 -> suit = "Spades";
                    case 1 -> suit = "Clubs";
                    case 2 -> suit = "Heats";
                    case 3 -> suit = "Diamonds";
                }
                System.out.println(cardNumber + " of " + suit);
            }
            for (boolean s : suits) {
                if (s) {
                    count++;
                }
            }//System.out.println(Arrays.toString(suits)+"_________"+count);
            if (count == 4) {
                break;
            }

        }
        System.out.println("Number of picks: " + picks);

    }

}
