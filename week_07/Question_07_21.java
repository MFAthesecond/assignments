package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of balls to drop: ");
        int balls = input.nextByte();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slotNumber = input.nextInt();

        int[] slots = new int[slotNumber];
        for (int i = 0; i < balls; i++) {
            double ballPosition = slotNumber / 2;
            for (int j = 0; j < slotNumber - 1; j++) {
                int rand = ((int) (Math.random() * 2));
                if (rand == 1) {
                    ballPosition+=0.5;
                    System.out.print("R");
                } else {
                    ballPosition-=0.5;
                    System.out.print("L");
                }
            }
            System.out.println();
            slots[(int) ballPosition]++;
        }
        System.out.println(Arrays.toString(slots));
        for (int i = balls/2; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < slotNumber; j++) {
                if (slots[j] >= i) {
                    System.out.print("O");
                } else System.out.print("_");
            }
        }
    }
}
