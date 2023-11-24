package week_05;

import java.util.Scanner;

public class Question_05_40 {
    public static void main(String[] args) {
int heads=0;
        for (int i = 0; i < 1000000; i++) {
            if ((int) (Math.random() * 2)==0) {
                heads++;
            }
        }
        System.out.println("Heads: "+heads);
        System.out.println("Tails: "+(1000000-heads));
    }
}
