package week_05;

import java.util.Scanner;

public class Question_05_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income = 0;
        double earn = 0;
        earn += (5000 * 0.08) + (5000 * 0.1);
        System.out.println(earn);
        while (earn < 30000) {
            if (earn + (income - 10000) * 0.12 >= 30000)
                break;
            income++;
        }
        System.out.println(income);
    }
}
