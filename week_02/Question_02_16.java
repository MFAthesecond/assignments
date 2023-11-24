package week_02;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side:");
        double side= input.nextDouble();
        double area= (Math.pow(3,0.5)*3*0.5)*Math.pow(side,2);
        System.out.println("The area of the hexagon is " + area);


    }
}
