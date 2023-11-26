package week_08;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        int round = 0;
        while (" " == anyWinner(board)) {
            displayBoard(board);
            playRound(board, round);
            round++;
        }
        displayBoard(board);
        System.out.println(anyWinner(board)+ " player won");
    }

    private static void displayBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("|  %s  ", board[i][j].isEmpty() ? "" : board[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("--------------------");
    }

    private static String anyWinner(String[][] board) {
        String[] winner = {" "};
        checkRows(board, winner);
        checkColumns(board, winner);
        checkDiagonals(board, winner);

        return winner[0];
    }

    private static boolean checkDiagonals(String[][] board, String[] winner) {
        if (!board[1][1].equals(" ")) {
            if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[2][2].equals(board[1][1])) {
                winner[0] = board[0][0];
                return true;
            } else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && board[2][0].equals(board[1][1])) {
                winner[0] = board[0][2];
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns(String[][] board, String[] winner) {
        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 1; j < 3; j++) {
                if (!board[j-1][i].equals(board[j][i]) || board[j][i].equals(" ")) {
                    break;
                } else count++;
                if (count == 2) {
                    winner[0] = board[j-1][i];
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkRows(String[][] board, String[] winner) {
        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 1; j < 3; j++) {
                if (!board[i][j - 1].equals(board[i][j]) || board[i][j - 1].equals(" ")) {
                    break;
                } else count++;
                if (count == 2) {
                    winner[0] = board[i][j - 1];
                    return true;
                }
            }

        }
        return false;
    }

    private static void playRound(String[][] board, int round) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a row (0, 1, or 2) for player %s: ", round % 2 == 0 ? "X" : "O");
        int x = input.nextInt();
        System.out.printf("Enter a column (0, 1, or 2) for player %s: ", round % 2 == 0 ? "X" : "O");
        int y = input.nextInt();
        board[x][y] = round % 2 == 0 ? "X" : "O";
    }
}
