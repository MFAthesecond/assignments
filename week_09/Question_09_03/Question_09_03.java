package week_09.Question_09_03;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        for (long i= 1; i <100000000 ; i*=10) {
            Date date=new Date(i*10000);
            System.out.println("For elapsed "+(i*10000)+" time is "+date.toString());
        }
    }
}
