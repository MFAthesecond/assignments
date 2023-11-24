package liveClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        try {

            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println(number1 + " / " + number2 + " is " +
                    (number1 / number2));

        } catch (ArithmeticException arEx) {
            System.out.println("bölen 0 olamaz");
            System.out.println(arEx.getMessage());
            System.out.println(arEx.toString());
        } catch (InputMismatchException inEx) {
            System.out.println("sadece sayı kabul ediyoruz");
        }
        System.out.println("kod çalışmaya devamke");
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }
}
