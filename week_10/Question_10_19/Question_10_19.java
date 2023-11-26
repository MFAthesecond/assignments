package week_10.Question_10_19;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        for (int p = 2; p <= 100; p++) {
            BigInteger mersenneNumber = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (isPrime(mersenneNumber)) {
                System.out.printf("%-6d     %d\n", p, mersenneNumber);
            }
        }
        System.out.println("finish");
    }

    public static boolean isPrime(BigInteger number) {
        for (BigInteger i = BigInteger.TWO; i.compareTo(number.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
