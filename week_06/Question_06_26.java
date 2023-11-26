package week_06;

public class Question_06_26 {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number);
        for (int i = 0; i < strNumber.length() / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isPalindrome(number) && isPrime(number)) {
                count++;
                System.out.print(" " + number);
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }


    }
}
