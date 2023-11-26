package week_11.Question_11_13;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(input.nextInt());
        }
        removeDuplicate(integerArrayList);

        System.out.print("The distinct integers are ");
        for (Integer integer : integerArrayList) {
            System.out.print(integer + " ");
        }

    }

    private static void removeDuplicate(ArrayList<Integer> integerArrayList) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            Integer number = integerArrayList.get(i);
            for (int j = i + 1; j < integerArrayList.size(); j++) {
                if (Objects.equals(number, integerArrayList.get(j))) {
                    integerArrayList.remove(j);
                }
            }
        }
    }
}
