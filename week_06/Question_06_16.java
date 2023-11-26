package week_06;

public class Question_06_16 {
    public static int numberOfDaysInAYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void printHeader() {
        System.out.printf("%-10s%-10s", "Year", "Day in year\n");
    }

    public static void printTable() {
        for (int year = 2000; year < 2021; year++) {
            System.out.printf("%-10d%-10d\n", year, numberOfDaysInAYear(year));
        }
    }

    public static void main(String[] args) {
        printHeader();
        printTable();
    }
}
