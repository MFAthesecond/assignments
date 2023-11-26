package week_08;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] table = record();
        int[][] totalLabor = sortingAndStaff(table);
        printin(totalLabor);

    }

    private static void printin(int[][] totalLabor) {
        for (int i = 0; i < totalLabor[0].length; i++) {
            System.out.printf("\nEmployee %d's total work hour is %d ", totalLabor[0][i], totalLabor[1][totalLabor[0].length-1-i]);
        }
    }

    private static int[][] sortingAndStaff(int[][] table) {
        int[] totalLabor = new int[table.length];
        int[][] sortedList = new int[2][table.length];
        for (int i = 0; i < totalLabor.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                totalLabor[i] += table[i][j];
            }
        }
        int[] sortedTotalLabor = Arrays.copyOf(totalLabor, totalLabor.length);
        Arrays.sort(sortedTotalLabor);
        sortedList[1] = Arrays.copyOf(sortedTotalLabor, sortedTotalLabor.length);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (sortedTotalLabor[i] == totalLabor[j]) {
                    sortedList[0][i] = j;
                    sortedTotalLabor[i] =-1;
                    totalLabor[j]=-2;
                }
            }
        }


        return sortedList;
    }

    private static int[][] record() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int workersNumber = input.nextInt();
        int[][] table = new int[workersNumber][7];

        System.out.println("Enter the working hours of employees: ");
        for (int i = 0; i < workersNumber; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = input.nextInt();
            }
        }
        return table;
    }
}
