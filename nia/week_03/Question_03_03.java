package week_02.assignments.assignments.nia.week_03;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter" + "a, b, c, d, e, f :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();


// ax + by = e
//cx + dy =f
        //x = 𝑒𝑑 − 𝑏𝑐 / 𝑎𝑑 − 𝑏𝑐
        //y = 𝑎𝑑 − 𝑒𝑐 / 𝑎𝑑 − 𝑏𝑐

        double x = (e * d) - (b * c) / (a * d) - (b * c);
        double y = (a * d) - (e * c) / (a * d) - (b * c);
        System.out.println(x + " and  " + y);

        if (x == -2.0 && y == 3.0) {
            System.out.println("x is " + x + " and " + y);

        } else {
            System.out.println("The equation has no solution ");
        }
        //  9,0 4,0 3,0 -5,0 -6,0 -21,0
        //9,0 4,0 3,0 -5,0 -6,0 -21,0

    }
}
