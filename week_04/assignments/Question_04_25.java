package week_04.assignments;

import java.util.Scanner;

public class Question_04_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        char p1=(char) ((Math.random()*26)+65);
        char p2=(char) ((Math.random()*26)+65);
        char p3=(char) ((Math.random()*26)+65);

        int p4=(int) (Math.random()*10000);

        System.out.println("Generated plate number:"+p1+p2+p3+p4);


    }
}
