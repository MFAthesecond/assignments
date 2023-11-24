package my_projects;

public class asdashgjgh {
    public static void main(String[] args) {
        // Check number of solutions
        int numberOfSolutions = 0;

        // A chess board
        char[][] board = new char[8][8];

        // Initialize the board
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = ' ';

        // Place queens
        placeQueens(0, board);
print(board);
        // Display solutions
        System.out.println("The total number of solutions is " + numberOfSolutions);
    }

    public static void placeQueens(int row, char[][] board) {
        int numberOfSolutions = 0;
        if (row == 8) { // Stopping condition
            print(board); // Display a solution
            numberOfSolutions++;
            return;
        }

        for (int column = 0; column < 8; column++) {
            if (isValid(row, column, board)) { // Check if the cell is valid
                board[row][column] = 'Q'; // Place a queen
                placeQueens(row + 1, board); // Recursive call to place the next queen
                board[row][column] = ' '; // Backtrack and remove the queen
            }
        }
    }

    public static boolean isValid(int row, int column, char[][] board) {
        // Check if the column has a queen
        for (int i = 0; i < row; i++)
            if (board[i][column] == 'Q')
                return false;

        // Check if the major diagonal has a queen
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check if the minor diagonal has a queen
        for (int i = row - 1, j = column + 1; i >= 0 && j < 8; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void print(char[][] board) {
        System.out.println("\n-----------------");

        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }
}

