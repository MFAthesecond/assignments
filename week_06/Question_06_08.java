package week_06;

public class Question_06_08 {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        double fahrenheit=120;
        System.out.printf("%-10s %-10s    |    %-10s %-10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("-------------------------------------------------");
        for (double c = 40; c >30 ; c--) {
            System.out.printf("%-10.1f %-10.1f    |    %-10.2f %-10.2f\n", c, celsiusToFahrenheit(c), fahrenheit, fahrenheitToCelsius(fahrenheit));
            fahrenheit-=10;
        }
    }
}
