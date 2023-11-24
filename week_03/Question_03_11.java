package week_03;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter te month as integer:");
        int month = input.nextInt();

        System.out.print("Enter the year as integer:");
        int year = input.nextInt();
        int dayOfMonth = 31;

        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                dayOfMonth = 28;
                if (year % 4 == 0 && year % 100 != 0) {
                    dayOfMonth = 29;
                }
                if (year % 400 == 0) {
                    dayOfMonth = 29;
                }

                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                dayOfMonth = 30;
                break;
            case 5:
                System.out.print("May");

                break;
            case 6:
                System.out.print("June");
                dayOfMonth = 30;
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                dayOfMonth = 30;

                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                dayOfMonth = 30;
                break;
            case 12:
                System.out.print("December");
                break;
        }

        System.out.printf(" %d had %d days ", year, dayOfMonth);
    }
}
