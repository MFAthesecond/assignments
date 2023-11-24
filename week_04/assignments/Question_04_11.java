package week_04.assignments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15);");
        int number = input.nextInt();

        if (number > 15)
            System.out.printf("%d is an invalid input.", number);
        else {
            System.out.print("The hex value is ");
            switch (number) {
                case 11:
                    System.out.println("A");
                    break;
                case 12:
                    System.out.println("B");
                    break;
                case 13:
                    System.out.println("C");
                    break;
                case 14:
                    System.out.println("D");
                    break;
                case 15:
                    System.out.println("E");
                    break;
                default:
                    System.out.println(number);

            }
        }
    }
}
