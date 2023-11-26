package week_06;

public class Question_06_27 {
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmirp(int number) {
        if (isPrime(number)) {
            String strNumber = String.valueOf(number);
            String reverse = "";
            for (int i = 0; i < strNumber.length(); i++) {
                reverse += strNumber.charAt(strNumber.length() -1- i);
            }
            if (isPrime(Integer.valueOf(reverse))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 10;
        while (count < 100) {
            number++;
            if (isEmirp(number)) {
                count++;
                System.out.print(number + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
