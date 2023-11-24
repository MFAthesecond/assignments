package week_05;

public class Question_05_20 {
    public static void main(String[] args) {

        int numberPerLines = 10;
        int lastNumber = 1000;
        int count = 0;
        for (int number = 2; number <= lastNumber; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < number ; divisor++) {
                if (number % divisor == 0){
                    isPrime = false;
                 break;}

            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
                if (count % numberPerLines == 0) System.out.println();
            }
        }
    }
}
