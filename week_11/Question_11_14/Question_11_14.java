package week_11.Question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = initializeList();
        ArrayList<Integer> list2 = initializeList();

        ArrayList<Integer> combinedList = union(list1, list2);

        System.out.print("The combined list is ");
        for (int i = 0; i < combinedList.size(); i++) {
            System.out.print(combinedList.get(i) + " ");
        }

    }

    private static ArrayList<Integer> initializeList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter five integers for list: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }
}
