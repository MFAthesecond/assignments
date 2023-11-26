package week_06;

public class Question_06_01 {
    public static int getPentagonalNumber(int n) {
        int result = n * (3 * n - 1) / 2;
        return result;
    }

    public static void main(String[] args) {
        int MAX_PER_LINE = 10;
        System.out.println("The first 100 pentagonal numbers, ten per line");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%10d", getPentagonalNumber(i));
            if (i % MAX_PER_LINE == 0) {
                System.out.println();
            }
        }

    }
}
