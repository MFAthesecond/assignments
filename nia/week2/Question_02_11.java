package week_02.assignments.assignments.nia;

import java.net.SocketOption;
import java.util.Scanner;

public class Question_02_11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years : ");

        //   saniyede bize kaç doğum ölüm olduğu verilmiş
        // 1 dakika 60 saniye 1 saat 3600 ve 1 günde buradan hesaplanır

        int günSaniye = 3600 * 24;
        // 1 gündeki saniye
        int yılSaniye = günSaniye * 365;
        // 1 yıldaki saniye

        int birth = yılSaniye / 7;
        int death = yılSaniye / 13;
        int immigrant = yılSaniye / 45;

        int currentP = 312032486;
        int years = input.nextInt();


        int total = (birth + immigrant - death);
        int inputTotal = currentP + total * years;

        System.out.println("The population in " + years + " years is " + inputTotal);


    }
}