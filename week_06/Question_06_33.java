package week_06;

public class Question_06_33 {
    public static long totalSeconds() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        return totalSeconds;
    }

    public static long totalMinutes() {
        long currentSecond = totalSeconds() % 60;
        long totalMinutes = totalSeconds() / 60;
        return totalMinutes;

    }

    public static long totalDays() {
        long totalHours = totalMinutes() / 60;
        long totalDays = totalHours / 24;
        return totalDays;
    }

    public static long totalHours(int timeZone) {
        long currentSecond = totalSeconds() % 60;
        long currentMinute = totalMinutes() % 60;
        long totalHours = totalMinutes() / 60;
        return totalHours + timeZone;
    }

    public static boolean isLeapYear(long year) {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
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

    public static long whichDayOfTheYear() {
        long sumOfDays = 0;
        for (int i = 1970; i < currentYear(); i++) {
            if (isLeapYear(i)) {
                sumOfDays += 366;
            } else sumOfDays += 365;
        }
        return (totalDays() - sumOfDays + 1);
    }

    public static void printDate() {
        long dayCount = 0;
        int daysOfMonth = 0;
        int month = 0;
        String nameOfMonth="";
        long dayOfTheMonth = 0;
        while (dayCount < whichDayOfTheYear()) {
            month++;
            dayCount += daysOfMonth;
            switch (month) {
                case 1 -> {
                    nameOfMonth = "January ";
                    daysOfMonth = 31;
                }
                case 2 -> {
                    nameOfMonth = "February ";
                    if (isLeapYear(currentYear())) {
                        daysOfMonth = 29;
                    } else
                        daysOfMonth = 28;
                }
                case 3 -> {
                    nameOfMonth = "March ";
                    daysOfMonth = 31;
                }
                case 4 -> {
                    nameOfMonth = "April ";
                    daysOfMonth = 30;
                }
                case 5 -> {
                    nameOfMonth = "May ";
                    daysOfMonth = 31;
                }
                case 6 -> {
                    nameOfMonth = "June ";
                    daysOfMonth = 30;
                }
                case 7 -> {
                    nameOfMonth = "July ";
                    daysOfMonth = 31;
                }
                case 8 -> {
                    nameOfMonth = "August ";
                    daysOfMonth = 31;
                }
                case 9 -> {
                    nameOfMonth = "September ";
                    daysOfMonth = 30;
                }
                case 10 -> {
                    nameOfMonth = "October ";
                    daysOfMonth = 31;
                }
                case 11 -> {
                    nameOfMonth = "November ";
                    daysOfMonth = 30;
                }
                case 12 -> {
                    nameOfMonth = "December ";
                    daysOfMonth = 31;
                }
            }

        }
        dayOfTheMonth = whichDayOfTheYear() - dayCount + daysOfMonth;
        System.out.printf("%s %d, %d", nameOfMonth.substring(0,3), dayOfTheMonth, currentYear());
    }

    public static void printCurrentTime() {
        long currentSecond = totalSeconds() % 60;
        long currentMinute = totalMinutes() % 60;
        long currentHour = totalHours(3) % 24;
        String timeMeridiem = "AM";
        if (currentHour > 12) {
            currentHour %= 12;
            timeMeridiem = "PM";
        }
        System.out.printf("%2d:%2d:%2d %s", currentHour, currentMinute, currentSecond, timeMeridiem);
    }

    public static void main(String[] args) {
        System.out.print("Current date and time is ");
        printDate();
        printCurrentTime();
    }

}