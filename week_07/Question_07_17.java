package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_17 {
    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        String[] students = new String[numberOfStudents];
        System.out.println("Enter the name and score of each student");

        int[] sortedScores = selectionSort(Arrays.copyOf(scores, numberOfStudents));
        for (int i = numberOfStudents - 1; i >= 0; i--) {
            for (int j = 0; j < numberOfStudents; j++) {
                System.out.print("Student " + (i + 1) + ": ");
                students[i] = input.next();
                System.out.print("Score: ");
                scores[i] = input.nextInt();
                if (sortedScores[i] == scores[j]) {
                    System.out.println(students[j]);
                    scores[j] = 0;
                }
            }
        }


    }
}

