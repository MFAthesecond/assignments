package week_02;

import java.util.Scanner;


public class Question_02_02 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and lenght of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double pi = Math.PI;
        double area = radius * radius * pi;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
