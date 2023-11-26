package week_10.Question_10_21;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;
        while (count < 10) {
            if (bigInteger.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)
                    || bigInteger.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(bigInteger);
                count++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }


    }
}
