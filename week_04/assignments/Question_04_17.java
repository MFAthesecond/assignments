package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();

        System.out.println("Enter a month (only with three letters):");
        String month = input.next();

        int days = 30;

        if (month.equals( "Jan") || month.equals( "Mar" )|| month.equals( "May" )|| month.equals( "Jul") ||
                month.equals( "Aug" )|| month.equals( "Oct") || month.equals( "Dec")) {
            days = 31;
        }
        if (month.equals( "Feb")) {
            if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                days = 29;
            } else days = 28;
        }
        System.out.printf("%s %d has %d days.",month,year,days);
    }
}
