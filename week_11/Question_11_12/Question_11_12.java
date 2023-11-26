package week_11.Question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            integerArrayList.add(input.nextInt());
        }
        System.out.println("Sum of the list: " + sum(integerArrayList));
    }

    private static Integer sum(ArrayList<Integer> integerArrayList) {
        Integer sum = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            sum+= integerArrayList.get(i);
        }
        return sum;
    }
}
