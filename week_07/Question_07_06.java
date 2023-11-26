package week_07;

public class Question_07_06 {
    //    public static boolean isPrime(int number) {
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int x=0;
//        int[] primes = new int[100];
//        for (int i = 0,j=2; i < primes.length; i++) {
//            while (primes[100]==0){
//
//
//            }
//        }
//
//    }
    public static void main(String[] args) {
        int[] primes = new int[50];
        int number = 2;
        while (primes[primes.length-1] == 0) {
            for (int i = 0; i < primes.length; i++) {
                while (!isPrime(number)) {
                    number++;
                }
                primes[i] = number;
                number++;
            }
        }
        printNumbers(primes);
    }

    private static void printNumbers(int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            System.out.printf("%3d ",primes[i]);
            if ((i+1)%10==0){
                System.out.println();
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
