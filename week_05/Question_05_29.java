package week_05;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (e.g. 2012):");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year: ");
        int firstDay = input.nextInt();
        int lengthOfMonth = 0;
        int dayOfWeek = firstDay;

        for (int month = 1; month < 13; month++) {
            switch (month) {
                case 1:
                    System.out.println("January " + year);
                    lengthOfMonth = 31;
                    break;
                case 2:
                    System.out.println("February " + year);
                    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                        lengthOfMonth = 29;
                    } else
                        lengthOfMonth = 28;
                    break;
                case 3:
                    System.out.println("March " + year);
                    lengthOfMonth = 31;
                    break;
                case 4:
                    System.out.println("April " + year);
                    lengthOfMonth = 30;
                    break;
                case 5:
                    System.out.println("May " + year);
                    lengthOfMonth = 31;
                    break;
                case 6:
                    System.out.println("June " + year);
                    lengthOfMonth = 30;
                    break;
                case 7:
                    System.out.println("July " + year);
                    lengthOfMonth = 31;
                    break;
                case 8:
                    System.out.println("August " + year);
                    lengthOfMonth = 31;
                    break;
                case 9:
                    System.out.println("September " + year);
                    lengthOfMonth = 30;
                    break;
                case 10:
                    System.out.println("October " + year);
                    lengthOfMonth = 31;
                    break;
                case 11:
                    System.out.println("November " + year);
                    lengthOfMonth = 30;
                    break;
                case 12:
                    System.out.println("December " + year);
                    lengthOfMonth = 31;
                    break;
            }
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-7s %-7s %-7s %-7s %-7s %-7s %-7s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
            for (int i = 0; i < dayOfWeek; i++) {
                System.out.printf("%-7s ", " ");
            }
            for (int daysOfMonth = 1; daysOfMonth <= lengthOfMonth; daysOfMonth++) {
                System.out.printf("%-8d", daysOfMonth);
                dayOfWeek++;
                dayOfWeek = dayOfWeek % 7;
                if (dayOfWeek == 0) {
                    System.out.println();
                }
            }
            System.out.println("\n");
        }
    }
}


