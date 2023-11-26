package week_06;

public class Question_06_09 {
    public static double footToMeter(double foot) {
        double meter = foot * 0.305;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = meter * 3.279;
        return foot;
    }

    public static void main(String[] args) {
        double meter = 20;
        System.out.printf("%-8s %-8s    |    %-8s %-8s", "Feet", "Meters", "Meters", "Feet");
        System.out.println("\n-------------------------------------------------");
        for (double feet = 1; feet <= 10; feet++) {
            System.out.printf("%-8.1f %-8.3f    |    %-8.1f %-8.3f\n",feet,footToMeter(feet),meter,meterToFoot(meter));
                    meter +=5;
        }
    }
}
