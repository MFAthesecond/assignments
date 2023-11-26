package week_10.Question_10_06;

import week_10.Question_10_05.StackOfIntegers;

import static week_06.Question_06_29.isPrime;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 2; i <= 120; i++) {
            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }
        System.out.println();
        int size = stackOfIntegers.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(stackOfIntegers.pop() + " ");
        }


    }


}
