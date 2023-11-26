package week_06;

public class Question_06_13 {
    public static double sumSeries(int i){
        double sum=0;
        for (double j = 1; j < i+1; j++) {
            sum +=j/(j+1);
        }return sum;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n","i","m(i)");
        System.out.println("------------------------");
        for (int j = 1; j < 21; j++) {
            System.out.printf("%-10d%-10.4f\n",j,sumSeries(j));
        }
    }
}
