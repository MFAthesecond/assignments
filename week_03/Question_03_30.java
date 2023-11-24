package week_03;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT:");
        int gmt = input.nextInt();

        long time = System.currentTimeMillis();
        long totalSeconds = time / 1000;
        long second = totalSeconds % 60;
        long minute = (totalSeconds / 60) % 60;
        long hour = ((totalSeconds / 60) / 60) % 24;

        System.out.printf("Your current time is %d:%d:%d ", ((hour+gmt) % 12) , minute, second);
        if (hour < 12) System.out.println("PM");
        else System.out.println("AM");
    }
}
