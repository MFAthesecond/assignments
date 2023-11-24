package week_05;

public class Question_05_27 {
    public static void main(String[] args) {

        int numberPerLines = 10;
        int count = 0;
        System.out.println("All the leap years from 101 to 2100");

        for (int year = 101; year < 3100; year += 1) {
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                System.out.print(year + " ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
    }
}
