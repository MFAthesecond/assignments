package week_08;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        System.out.print("Enter list 1:");
        int[][] list1 = initializeMatrix();
        System.out.print("Enter list 2:");
        int[][] list2 = initializeMatrix();
        System.out.printf("The two arrays are %s strictly identical",(equals(list1,list2)?"\b":"not"));

    }

    private static boolean equals(int[][] list1, int[][] list2) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length; j++) {
                if (list1[i][j]!=list2[i][j]){
                    return false;
                }
            }
        }return true;
    }

    private static int[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }return matrix;
    }
}
