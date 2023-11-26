package week_11.Question_11_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        System.out.print("Enter a list of integers ending with 0: ");
        Integer a = input.nextInt();
        while (a != 0) {
            integerArrayList.add(a);
            a = input.nextInt();
        }
        System.out.println("Before shuffling...");
        for (Integer i : integerArrayList) {
            System.out.print(i+" ");
        }
        shuffle(integerArrayList);
        System.out.println();
        System.out.println("After shuffling...");
        for (Integer i : integerArrayList) {
            System.out.print(i+" ");
        }
    }

    private static void shuffle(ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            Integer temp = integerArrayList.get(i);
            int random = (int)( Math.random() * integerArrayList.size());
            integerArrayList.set(i, integerArrayList.get(random));
            integerArrayList.set(random, temp);
        }
    }
}