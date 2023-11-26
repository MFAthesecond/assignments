package week_07;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 0, j = 0; i < 100; i++) {
            j = (int) (Math.random() * 100);
            for (int k = 0; k < 10; k++) {
                if (j - (k * 10) <= 10) {
                    count[k]++;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "s: " + count[i]);
        }
    }
}
