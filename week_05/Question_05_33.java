package week_05;


public class Question_05_33 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 1;
        for (int i = 2; i > 0; i++) {
            sum = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(sum);
                count++;
                }
            }
        }
    }

