package week_06;

public class Question_06_30 {
    public static void whoIsWinner(int roll1, int roll2) {
        int sumOfRolls = roll1 + roll2;
        if (sumOfRolls == 2 || sumOfRolls == 3 || sumOfRolls == 12) {
            System.out.println("You lose");
        } else if (sumOfRolls == 7 || sumOfRolls == 11) {
            System.out.println("You win");
        } else {
            final int point = roll1 + roll2;
            System.out.println("point is " + point);
            while (true) {
                roll1 = roll();
                roll2 = roll();
                if (roll1 + roll2 == 7) {
                    System.out.printf("You rolled %d + %d = %d\n", roll1, roll2, roll1 + roll2);
                    System.out.println("You lose");
                    break;
                } else if (roll1 + roll2 == point) {
                    System.out.printf("You rolled %d + %d = %d\n", roll1, roll2, roll1 + roll2);
                    System.out.println("You win");
                    break;
                }
            }
        }
    }

    public static int roll() {
        int dice = (int) (Math.random() * 6) + 1;
        return dice;
    }

    public static void main(String[] args) {
        int roll1 = roll();
        int roll2 = roll();
        System.out.printf("You rolled %d + %d = %d\n", roll1, roll2, roll1 + roll2);
        whoIsWinner(roll1, roll2);
    }
}
