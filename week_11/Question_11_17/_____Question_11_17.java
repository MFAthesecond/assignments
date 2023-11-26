package week_11.Question_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class _____Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int finalM = m;

        ArrayList<Integer> list = new ArrayList<>();
        int divisor = 2;
        while (m > 1) {

            if (m % divisor == 0) {
                list.add(divisor);
                m /= divisor;
            } else {
                divisor = divisor + 1;
            }
        }
        ArrayList<Integer> listForN = new ArrayList<>();

        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
            } else if (count % 2 == 0) {
                count = 0;
            } else {
                listForN.add(list.get(i));
                System.out.println(list.get(i));
                count = 0;
            }
        }
        int n = 1;
        for (int i = 0; i < listForN.size(); i++) {
            n *= listForN.get(i);
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (finalM * n));


    }
}
