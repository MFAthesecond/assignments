package week_03;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:(e.g. 2012)");
        int year = input.nextInt();
        int j = year/100;
        int k = year % 100;

        System.out.println("Enter month: 1-12");
        int m = input.nextInt();

        System.out.println("Enter the day of the month: 1-31:");
        int q = input.nextInt();
        String day = "";

        int h = ((q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j+1) % 7);


        switch (h) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        System.out.print("Day of the week is " + day);
    }
}

