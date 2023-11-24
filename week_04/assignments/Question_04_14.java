package week_04.assignments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade:");
        char grade = input.next().toUpperCase().charAt(0);
        int value = 0;

        switch (grade) {
            case 'A':
                value = 4;
                break;
            case 'B':
                value = 3;
                break;
            case 'C':
                value = 2;
                break;
            case 'D':
                value = 1;
                break;
            case 'F':
                value = 0;
                break;
        }
        if (value==0){ System.out.printf("%c is an invalid value",grade);
    }   else System.out.printf("The numeric value for grade %c is %d",grade,value);
}}
