package week_08;

import java.util.Scanner;

public class Question_08_24____________ {

    /*
    row control ++
    col control
    3*3 box control
     */
    public static void main(String[] args) {
        int[][] grid = readGrid();
        isValid(grid);
    }

    private static int[][] readGrid() {
        Scanner input = new Scanner(System.in);
        int[][] grid = new int[9][9];
        System.out.println("Enter a Sudoku puzzle solution: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (checkInput(input.nextInt())) {
                    grid[i][j] = input.nextInt();
                }
            }
            if (!isValid(grid[i])) {
                System.out.println("Invalid solution");
                break;
            }
        }
        if (!isValid(grid)) {
            System.out.println("Invalid solution");
        }
        return grid;
    }

    private static boolean isValid(int[][] grid) {
        if (isValidBoxes(grid)) {
            return false;
        }
        boolean[] control = new boolean[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (control[grid[j][i]]) {
                    return false;
                }
                control[grid[j][i]] = true;
            }
            control = new boolean[9];
        }
        return true;
    }

    private static boolean isValidBoxes(int[][] grid) {
        boolean[] control = new boolean[9];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = (i / 3); j < (i / 3) + 3; j++) {
                for (int k = (i % 3); k < (i % 3) + 3; k++) {
                    System.out.print(grid[j][k]);
                }
            }
            System.out.println();
        }
        return true;
    }

    private static boolean isValid(int[] row) {
        boolean[] control = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (control[row[i]]) {
                return false;
            }
            control[row[i]] = true;
        }
        return true;
    }

    public static boolean checkInput(int num) {
        return (num > 0 && num < 10);
    }
}
