package week_04.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city1 = input.nextLine();
        System.out.println("Enter the second city:");
        String city2 = input.nextLine();
        System.out.println("Enter the third city:");
        String city3 = input.nextLine();

        String biggest = city1;
        String second = city2;
        String last = city3;

        if (city3.compareTo(city2) < 0 || city3.compareTo(city1) < 0) {
            if (city3.compareTo(city2) < 0 && city3.compareTo(city1) < 0) {
                biggest = city3;
            } else if (city3.compareTo(city2) < 0) {
                second = city3;
                last = city2;
            } else {
                second = city3;
                last = city1;
            }
        }
        if (city2.compareTo(city1) < 0 || city2.compareTo(city3) < 0) {
            if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
                biggest = city2;
            } else if (city2.compareTo(city1) < 0) {
                second = city2;
                last = city1;
            } else {
                second = city2;
                last = city3;
            }
        }
        if (city1.compareTo(city2) < 0 || city1.compareTo(city3) < 0) {
            if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
                biggest = city1;
            } else if (city1.compareTo(city2) < 0) {
                second = city1;
                last = city2;
            } else {
                second = city1;
                last = city3;
            }
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s",biggest,second,last);
    }
}
