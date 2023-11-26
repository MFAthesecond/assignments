package week_06;

public class Question_06_28 {
    public static boolean isPrime(long number) {
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMersennePrime(long number) {

        if (isPrime((long) Math.pow(2, number) - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.printf("%-15s %-15s\n", "p", "2^p-1");
        System.out.println("-------------------------");
        for (int p = 2; p <= 31; p++) {
            if (isMersennePrime(p)) {
                System.out.printf("%-15d %-15.0f\n", p, Math.pow(2, p) - 1);
            }
        }
    }
}
