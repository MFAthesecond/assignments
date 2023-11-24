package week_05;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();
int num=0;
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += (i * ((int) isbn.charAt(i-1)-48));
        }
        char last =(sum%11==10)?'X': (char) ((sum % 11)+48);
        System.out.printf("The ISBN-10 number is %s%c ",isbn,last);
    }
}


//013601267
//013031997