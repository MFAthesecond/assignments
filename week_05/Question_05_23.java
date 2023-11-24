package week_05;

import java.util.Scanner;

public class Question_05_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumlr = 1;
       double sumrl = 0;
        for (int i = 1; i < 50000; i++) {
            sumlr = sumlr+(1.0 / (i + 1.0));
        }
        for (int i = 50000; i >= 1; i--) {
            sumrl += 1.0 / i ;
        }
        System.out.println("Summation of series left to right: "+sumlr);
        System.out.println("Summation of series right to left: "+sumrl);
        System.out.println("Summation of series right to left - Summation of series left to right: "+(sumrl-sumlr));
    }
}
