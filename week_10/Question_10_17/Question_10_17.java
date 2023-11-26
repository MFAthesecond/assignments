package week_10.Question_10_17;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {
        String number = Long.toString(Long.MAX_VALUE);
        BigInteger integer = new BigInteger(number);
        BigInteger sqrt= integer.sqrt();
        BigInteger one= new BigInteger("1");
        System.out.println(integer);
        System.out.println();
        int count=0;
        while (count<10){
            System.out.println(sqrt.multiply(sqrt));
            sqrt=sqrt.add(one);
            count++;
        }
    }
}
