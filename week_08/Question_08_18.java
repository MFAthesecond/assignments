package week_08;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(matrix);
displayMatrix(matrix);

    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void shuffle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int random = (int) (Math.random() * matrix.length);
            int[] temp = matrix[random];
            matrix[random] = matrix[i];
            matrix[i] = temp;
        }
    }
}
