package week_10.Question_10_08;

public class Question_10_08 {
    public static void main(String[] args) {
        printTable();
    }

    private static void printTable() {
        System.out.printf("                        %s \n", "2009 Taxes");
        System.out.printf("%-12s%-12s%-12s%-12s%-12s  \n", "Income", "Status 0", "Status 1", "Status 2", "Status 3");
        System.out.println("---------------------------------------------------------");
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%-12s", i);
            for (int j = 0; j < 4; j++) {
                Tax tax = new Tax(j, i);
                System.out.printf("%-12.2f", tax.getTax());
            }
            System.out.println();
        }
    }
}