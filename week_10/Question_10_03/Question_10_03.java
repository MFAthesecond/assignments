package week_10.Question_10_03;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(5);
        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(myInteger.equals(123555));
        System.out.println(myInteger.equals(new MyInteger(123546654)));
        System.out.println(MyInteger.isEven(4));
        System.out.println(MyInteger.isOdd(4));
        System.out.println(MyInteger.isPrime(5));
        char[] chars = {'1', '2', '3'};
        System.out.println(MyInteger.parseInt(chars));
        System.out.println("147");
    }
}
