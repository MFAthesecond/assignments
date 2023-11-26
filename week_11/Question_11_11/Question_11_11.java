package week_11.Question_11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of integers ending with 0: ");
        int number = input.nextInt();
        while (number != 0) {
            integerArrayList.add(number);
            number = input.nextInt();
        }
        System.out.println("Before sorting:");
        for (Integer value : integerArrayList) {
            System.out.print(value + " ");
        }
        sort(integerArrayList);
        System.out.println("After sorting:");
        for (Integer integer : integerArrayList) {
            System.out.print(integer + " ");
        }
    }

    private static void sort(ArrayList<Integer> integerArrayList) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < integerArrayList.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < integerArrayList.size() - i - 1; j++) {
                if (integerArrayList.get(j) > integerArrayList.get(j + 1)) {

                    // Swap arr[j] and arr[j+1]
                    temp = integerArrayList.get(j);
                    integerArrayList.set(j, integerArrayList.get(j + 1));
                    integerArrayList.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

}


