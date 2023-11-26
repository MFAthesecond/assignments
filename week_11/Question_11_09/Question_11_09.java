package week_11.Question_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n:");
        int size = input.nextInt();
        int[][] array = initializeBinaryArray(size);
        System.out.println("The random array is");
        printArray(array);

        printLargestRow(array);
        printLargestColumn(array);
    }

    private static void printLargestColumn(int[][] array) {
        ArrayList<Integer> integerArrayLargestColumnList = findLargestCol(array);
        System.out.println("The largest column index: ");
        for (int i = 0; i < integerArrayLargestColumnList.size(); i++) {
            System.out.print(integerArrayLargestColumnList.get(i) + ", ");
        }
        System.out.println("\b\b");
    }

    private static ArrayList<Integer> findLargestCol(int[][] array) {

        int[] cols = new int[array.length];
        int max = 0;
        ArrayList<Integer> integerArrayColList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int colSum = 0;
            for (int j = 0; j < array.length; j++) {
                colSum += array[j][i];
            }
            cols[i] = colSum;
            if (max < colSum) {
                max = colSum;
            }
        }
        for (int i = 0; i < cols.length; i++) {
            if (cols[i] == max) {
                integerArrayColList.add(i);
            }
        }
        return integerArrayColList;
    }

    private static void printLargestRow(int[][] array) {
        ArrayList<Integer> integerArrayList = findLargestRow(array);
        System.out.println("The largest row index: ");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.print(integerArrayList.get(i) + ", ");
        }
        System.out.println("\b\b");
    }

    private static ArrayList<Integer> findLargestRow(int[][] array) {
        int[] rows = new int[array.length];
        int max = 0;
        ArrayList<Integer> integerArrayRowList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array.length; j++) {
                rowSum += array[i][j];
            }
            rows[i] = rowSum;
            if (max < rowSum) {
                max = rowSum;
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == max) {
                integerArrayRowList.add(i);
            }
        }
        return integerArrayRowList;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] initializeBinaryArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }


}

