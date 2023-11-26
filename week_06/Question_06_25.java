package week_06;

import java.util.Scanner;

public class Question_06_25 {
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        String time=""+totalHours+":"+(totalMinutes%60)+":"+(totalSeconds%60);
        return time;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis= input.nextLong();
        System.out.println("hours:minutes:seconds: "+convertMillis(millis));

    }

}
