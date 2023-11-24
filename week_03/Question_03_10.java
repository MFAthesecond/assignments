package week_03;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number1= (int) (Math.random()*101);
        int number2= (int) (Math.random()*101);

        System.out.printf("What is %d + %d = ? ",number1,number2);
        int answer = input.nextInt();

        if((number1+number2)==answer){
            System.out.println("You are correct!");
        }else System.out.printf("You are wrong! %d + %d should be %d ",number1,number2,number1+number2);


    }
}
