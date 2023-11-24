package week_05;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (e.g. 2012):");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year: ");
        int firstDay = input.nextInt();
        int dayNumber = firstDay;
        String dayName = "";

        for (int month = 1; month < 13; month++) {

            switch (dayNumber % 7) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }

            switch (month) {
                case 1:
                    System.out.printf("January 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 2:
                    System.out.printf("February 1, %d is %s", year,dayName);
                    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                        dayNumber += 29;
                    } else dayNumber += 28;
                    break;
                case 3:
                    System.out.printf("March 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 4:
                    System.out.printf("April 1, %d is %s", year,dayName);
                    dayNumber += 30;
                    break;
                case 5:
                    System.out.printf("May 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 6:
                    System.out.printf("June 1, %d is %s", year,dayName);
                    dayNumber += 30;
                    break;
                case 7:
                    System.out.printf("July 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 8:
                    System.out.printf("August 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 9:
                    System.out.printf("September 1, %d is %s", year,dayName);
                    dayNumber += 30;
                    break;
                case 10:
                    System.out.printf("October 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;
                case 11:
                    System.out.printf("November 1, %d is %s", year,dayName);
                    dayNumber += 30;
                    break;
                case 12:
                    System.out.printf("December 1, %d is %s", year,dayName);
                    dayNumber += 31;
                    break;

            }

            System.out.println();
        }

    }
}
