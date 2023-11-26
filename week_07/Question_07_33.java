package week_07;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Sheep"};
        System.out.println("Enter a year: ");
        int year= input.nextInt();
        System.out.printf("%d is a year of %s in Zodiac",year,zodiac[year%12]);

    }
}
