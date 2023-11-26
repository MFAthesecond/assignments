package week_06;

public class Question_06_14 {
    public static double computePI(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (Math.pow(-1, j + 1)) / (2 * j - 1);
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "i", "m(i)");
        System.out.println("-------------------------");
        for (int i = 1; i <= 901; i++) {
            if (i % 100 == 1) {
                System.out.printf("%-10d %-10.4f\n", i, computePI(i));
            }
        }
    }
}
