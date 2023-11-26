package week_08;

public class Question_08_10 {

    public static void main(String[] args) {
        int[][] matrix = fillArray();
        printMatrix(matrix);
        displayResult(matrix);
    }

    private static void displayResult(int[][] matrix) {
        int maxRowIndex = findMaxRow(matrix);
        System.out.println("The largest row index: " + maxRowIndex);
        int maxColIndex = findMaxCol(matrix);
        System.out.println("The largest column index: " + maxColIndex);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int findMaxRow(int[][] matrix) {
        int max = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index;
    }

    private static int findMaxCol(int[][] matrix) {
        int max = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix[j][i];
                if (sum > max) {
                    max = sum;
                    index = i;
                }
            }
        }
        return index;
    }

    private static int[][] fillArray() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }
}
