package week_08;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] cities = initializeCities();
      findCentralCity(cities);

    }

    private static void findCentralCity(double[][] cities) {
        double[] distances = new double[cities.length];
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                if (i == j) continue;
                distances[i] += distance(cities[i], cities[j]);
            }
        }
        double min=0;
        int index=0;
        for (int i = 0; i < cities.length; i++) {
            if (distances[i]<min){
                min=distances[i];
                index=i;
            }
        }
        System.out.printf("The central city is at (%.1f, %.1f) \n",cities[index][0],cities[index][1]);
        System.out.printf("The total distance to other cities is %.2f",distances[index]);
    }

    private static double distance(double[] city, double[] city1) {
        return Math.sqrt((city1[0] - city[0]) * (city1[0] - city[0]) + (city1[1] - city[1]) * (city1[1] - city[1]));
    }

    private static double[][] initializeCities() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        double[][] cities = new double[input.nextInt()][2];
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < 2; j++) {
                cities[i][j] = input.nextDouble();
            }
        }
        return cities;
    }
}
//2,5 5 5,1 3 1 9 5,4 54 5,5 2,1