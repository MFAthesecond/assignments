package week_02.assignments.assignments.nia.week_03;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day:");
        int currentDay = input.nextInt();

        //current day = bugün
        //number of day = gün sayısı


        System.out.println("Enter the number of days elapsed since today:");
        int numberOfDay = input.nextInt();

        int futureDay = (numberOfDay + currentDay) % 7;

        String currentDayName;
        switch (currentDay) {
            case 1:
                currentDayName = "Monday";
                break;
            case 2:
                currentDayName = "Tuesday";
                break;
            case 3:
                currentDayName = "Wednesday";
                break;
            case 4:
                currentDayName = "Thursday";
                break;
            case 5:
                currentDayName = "Friday";
                break;
            case 6:
                currentDayName = "Saturday";
                break;
            case 7:
                currentDayName = "Sunday";
                break;
            default:
                currentDayName = "İnvalid Day!";
        }
        String futureDayName;
        switch (futureDay) {
            case 1:
                futureDayName = "Monday";
                break;
            case 2:
                futureDayName = "Tuesday";
                break;
            case 3:
                futureDayName = "Wednesday";
                break;
            case 4:
                futureDayName = "Thursday";
                break;
            case 5:
                futureDayName = "Friday";
                break;
            case 6:
                futureDayName = "Saturday";
                break;
            case 7:
                futureDayName = "Sunday";
                break;
            default:
               futureDayName = "İnvalid Day!";
                break;

        }
System.out.println("Today is " + currentDayName + " and the future day is " + futureDayName  );

    }
}