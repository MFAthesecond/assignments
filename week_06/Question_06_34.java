package week_06;

import java.util.Scanner;

public class Question_06_34 {
    public static long totalSeconds() {
        long totalMilliseconds = System.currentTimeMillis();
        return totalMilliseconds / 1000;
    }

    public static long totalMinutes() {
        return totalSeconds() / 60;

    }

    public static long totalDays() {
        long totalHours = totalMinutes() / 60;
        return totalHours / 24;
    }

    public static boolean isLeapYear(long year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static long whichDayOfTheYear(long year) {
        long sumOfDays = 0;
        for (int i = 1970; i < year; i++) {
            if (isLeapYear(i)) {
                sumOfDays += 366;
            } else sumOfDays += 365;
        }
        return (totalDays() - sumOfDays + 1);
    }

    public static long currentYear() {
        long sumOfDays = 0;
        int year = 1970;
        while (sumOfDays < totalDays()) {
            if (isLeapYear(year)) {
                sumOfDays += 366;
            } else sumOfDays += 365;
            year++;
        }
        return year - 1;
    }

    public static long findDayOfTheMonth(long year, long month) {
        long dayCount = 0;
        int daysOfMonth = 0;

        long dayOfTheMonth;
        while (dayCount < whichDayOfTheYear(year)) {
            month++;
            dayCount += daysOfMonth;
            switch ((int) month) {
                case 1 -> daysOfMonth = 31;
                case 2 -> {
                    if (isLeapYear(currentYear())) {
                        daysOfMonth = 29;
                    } else
                        daysOfMonth = 28;
                }
                case 3 -> daysOfMonth = 31;
                case 4 -> daysOfMonth = 30;
                case 5 -> daysOfMonth = 31;
                case 6 -> daysOfMonth = 30;
                case 7 -> daysOfMonth = 31;
                case 8 -> daysOfMonth = 31;
                case 9 -> daysOfMonth = 30;
                case 10 -> daysOfMonth = 31;
                case 11 -> daysOfMonth = 30;
                case 12 -> daysOfMonth = 31;
            }

        }
        dayOfTheMonth = whichDayOfTheYear(year) - dayCount + daysOfMonth;
        return dayOfTheMonth;
    }

    public static long findDayOfTheWeek(long year, long month) {
        long q = findDayOfTheMonth(year, month);
        long k = year % 100;
        long j = (year / 100) + 1;

        return (q + ((26 * (month + 1)) / 10) + k + (k / 4) + j / 4 + 5 * j) % 7;
    }

    public static void printCalendar(long year, long month) {
        int lengthOfMonth = 0;
        String nameOfMonth = "";
        long dayOfWeek = findDayOfTheWeek(year, month);

        switch ((int) month) {
            case 1 -> {
                nameOfMonth = "January ";
                lengthOfMonth = 31;
            }
            case 2 -> {
                nameOfMonth = "February ";
                if (isLeapYear(currentYear())) {
                    lengthOfMonth = 29;
                } else
                    lengthOfMonth = 28;
            }
            case 3 -> {
                nameOfMonth = "March ";
                lengthOfMonth = 31;
            }
            case 4 -> {
                nameOfMonth = "April ";
                lengthOfMonth = 30;
            }
            case 5 -> {
                nameOfMonth = "May ";
                lengthOfMonth = 31;
            }
            case 6 -> {
                nameOfMonth = "June ";
                lengthOfMonth = 30;
            }
            case 7 -> {
                nameOfMonth = "July ";
                lengthOfMonth = 31;
            }
            case 8 -> {
                nameOfMonth = "August ";
                lengthOfMonth = 31;
            }
            case 9 -> {
                nameOfMonth = "September ";
                lengthOfMonth = 30;
            }
            case 10 -> {
                nameOfMonth = "October ";
                lengthOfMonth = 31;
            }
            case 11 -> {
                nameOfMonth = "November ";
                lengthOfMonth = 30;
            }
            case 12 -> {
                nameOfMonth = "December ";
                lengthOfMonth = 31;
            }
        }
        System.out.println("             " + nameOfMonth + "   " + year);
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();
        printCalendar(year, month);
    }
}