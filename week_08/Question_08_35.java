//package week_08;
//
//import java.util.Scanner;
//
//public class Question_08_35 {
//    public static void main(String[] args) {
//        /*
//        check every point via growing number of rows and when you find a fault break
//        */
//        int[][] matrix = initializeMatrix();
//        int[] largestBlock = findLargestBlock(matrix);
//
//    }
//
//    private static int[] findLargestBlock(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if (matrix[i][j] == 1) {
//                    int blockSize = findBlock(matrix, i,j,1);
//                }
//            }
//        }
//    }
//
//    private static int findBlock(int[][] matrix, int row, int column,int blockSize) {
//        blockSize++;
//        int [][]subMatrix=buildSubMatrix()
//
//        for (int i = 0; i < blockSize; i++) {
//            for (int j = 0; j < blockSize; j++) {
//
//            }
//        }
//    }
//
//    private static int[][] buildSubMatrix() {
//    }
//
//    private static int[][] initializeMatrix() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of rows in the matrix: ");
//        int numberOfRows = input.nextInt();
//        int[][] matrix = new int[numberOfRows][numberOfRows];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[i][j] = (int) (Math.random() * 2);
//            }
//        }
//        return matrix;
//    }
//
//}
