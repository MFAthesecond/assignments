package week_10.Question_10_16;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        int count = 0;
        String numberString = "10000000000000000000000000000000000000000000000000";
        BigInteger i = new BigInteger(numberString);
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        while (count < 10) {
            if (i.mod(two).equals(zero) || i.mod(three).equals(zero)) {
                System.out.println(i);
                count++;
            }
            i = i.add(one);
        }
    }
}
