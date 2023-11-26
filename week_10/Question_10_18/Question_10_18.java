package week_10.Question_10_18;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        BigInteger startNumber = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int count = 0;

        while (count < 5) {
            if (isPrime(startNumber)) {
                System.out.println(startNumber);
                count++;
            }
            startNumber = startNumber.add(BigInteger.ONE);
        }
    } public static boolean isPrime(BigInteger number) {
        for (BigInteger i = BigInteger.TWO; i.compareTo(number.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
/*
9223372036854775837
9223372036854775907
9223372036854775931
9223372036854775939
9223372036854775963
 */