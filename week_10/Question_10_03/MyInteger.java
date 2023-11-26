package week_10.Question_10_03;

public class MyInteger {
    public int value;

    public int getValue() {
        return this.value;
    }

    MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {

        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i <= Math.sqrt(this.value); i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <=Math.sqrt( number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int i = 2; i <= Math.sqrt(myInteger.getValue()); i++) {
            if (myInteger.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int number) {
        return number == this.value;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.getValue() == this.value;
    }

    public static int parseInt(char[] chars) {
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            x += (int) (Math.pow(10, i) * (Character.getNumericValue(chars[chars.length-i-1])));
        }

        return x;
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
