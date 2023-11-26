package week_06;

public class Question_06_11 {
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        for (int i = 0; i < salesAmount; i++) {
            if (i < 5000) {
                commission += 0.08;
            } else if (i < 10000) {
                commission += 0.1;
            } else {
                commission += 0.12;
            }
        }
        return commission;
    }
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");
        System.out.println("--------------------------------------");
        for (int amount = 10000; amount <= 100000; amount += 5000) {
            System.out.printf("%-15d%-15.1f", amount, computeCommission(amount));
            System.out.println();
        }
    }
}
