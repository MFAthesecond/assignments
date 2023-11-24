package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN:");
        String ssn = input.nextLine();
        System.out.print(ssn);

        boolean c1 = Character.isDigit(ssn.charAt(0));
        boolean c2 = Character.isDigit(ssn.charAt(1));
        boolean c3 = Character.isDigit(ssn.charAt(2));
      //  boolean c4 = Character.isLetter(ssn.charAt(0));
        boolean c5 = Character.isDigit(ssn.charAt(4));
        boolean c6 = Character.isDigit(ssn.charAt(5));
     //   boolean c7 = Character.isLetter(ssn.charAt(0));
        boolean c8 = Character.isDigit(ssn.charAt(7));
        boolean c9 = Character.isDigit(ssn.charAt(8));
        boolean c10 = Character.isDigit(ssn.charAt(9));
        boolean c11 = Character.isDigit(ssn.charAt(10));

        if (c1 && c2 && c3 && c5 && c6 &&  c8 && c9 && c10 && c11){
            System.out.println(" is a valid social security number");
        }else System.out.println(" is an invalid social security number");

    }//232-23-5435
}
