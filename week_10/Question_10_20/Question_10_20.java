package week_10.Question_10_20;

import java.math.BigInteger;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println("The e values for i = 100 to 1000:");
        System.out.println("i                e               ");
        System.out.println("---------------------------------");
        int i = 1;
        BigInteger e = new BigInteger("1");
        while (i <= 1000) {
            e = e.add(BigInteger.ONE.divide(getFactorial(i)));
            if (i%100==0){
                System.out.printf("%-6d %d",i,e);
            }
            i++;
            System.out.println(i);
        }


    }

    private static BigInteger getFactorial(int i) {
        BigInteger bigInteger = new BigInteger("1");
        for (int j = 0; j < i; j++) {
            bigInteger = bigInteger.multiply(bigInteger.add(BigInteger.ONE));
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
        return bigInteger;
    }
}
