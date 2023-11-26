package week_06;

import java.util.Scanner;

public class Question_06_36 {   public static double area(double numberOfSides,double side) {
    return (numberOfSides * side * side) / (4 * Math.tan(Math.PI / numberOfSides));
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();
        System.out.println("Enter the side: ");
        double side=input.nextDouble();
        System.out.println("The area of the pentagon is " + area(numberOfSides,side));
    }
}
