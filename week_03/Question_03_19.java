package week_03;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges of the triangle:");
        int e1 = input.nextInt();
        int e2 = input.nextInt();
        int e3 = input.nextInt();

        if (e1+e2<e3||e1+e3<e2||e2+e3<e1){
            System.out.println("The input is invalid");
        } else System.out.println("The perimeter is "+(e1+e2+e3));



    }
}
