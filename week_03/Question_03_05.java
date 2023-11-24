package week_03;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapse = input.nextInt();
        String first = "", second = "";


        for (int i = 0; i <= 2; i++) {
            String f = "";
            int x = day;
            if (i == 2) {
                x = (elapse + day) % 7;
            }

            switch (x) {
                case 0:
                    f = "Sunday";
                    break;
                case 1:
                    f = "Monday";
                    break;
                case 2:
                    f = "Tuesday";
                    break;
                case 3:
                    f = "Wednesday";
                    break;
                case 4:
                    f = "Thursday";
                    break;
                case 5:
                    f = "Friday";
                    break;
                case 6:
                    f = "Saturday";
                    break;
            }
            if (i == 1) {
                first = f;
            }
            if (i == 2) {
                second = f;
            }
        }

        System.out.printf("Today is %s and the future day is %s", first, second);
    }
}
