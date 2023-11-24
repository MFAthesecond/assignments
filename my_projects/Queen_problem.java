package my_projects;

import java.util.Arrays;

public class Queen_problem {
    public static void main(String[] args) {
        int[] chessBoard = new int[64];
        while (true) {
            chessBoard = QueenProblem();
            if (chessBoard[0] == -1) {
                chessBoard = QueenProblem();
            } else {
                printChessBoard(chessBoard);
                break;
            }
        }
    }

    public static int[] QueenProblem() {
        int[] chessBoard = new int[64];
        int[] rows = new int[8];
        int[] columns = new int[8];
        long count = 7;
        int Q = (int) (Math.random() * 64);
        //   int Q = 56;

        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                while (chessBoard[Q] >= 1 || rows[Q / 8] > 0 || columns[(Q % 8)] > 0) {
                    Q = (int) (Math.random() * 64);
                }
            } else {
                while (chessBoard[Q] >= 1 || rows[Q / 8] > 0 || columns[(Q % 8)] > 0) {
                    Q++;
                    Q %= 64;
                    count++;
                    if (count > 100000) {
                        chessBoard[0] = -1;
                        return chessBoard;
                    }
                }
            }
            rows[Q / 8]++;
            columns[(Q % 8)]++;
            chessBoard[Q] = 5;
            int x = Q - 7;
            //sağ üst
            while (x > 0 && x < 64 && chessBoard[x] >= 0) {
                if (x % 8 == 0) {
                    break;
                }
                if ((x) % 8 == 7) {
                    chessBoard[x] = 1;
                    break;
                }
                chessBoard[x] = 1;
                x -= 7;
                if (x <= 0) {
                    break;
                }
            }
            x = Q - 9;
            //sol üst
            while (x >= 0 && x < 64 && chessBoard[x] >= 0) {

                if (x % 8 == 0) {
                    chessBoard[x] = 1;
                    break;
                }
                if ((x) % 8 == 7) {
                    break;
                }
                chessBoard[x] = 1;
                x -= 9;
                if (x < 0) {
                    break;
                }
            }
            //sağ alt
            x = Q + 9;
            while ( x < 64 && chessBoard[x] >= 0) {
                if ((x) % 8 == 7) {
                    chessBoard[x] = 1;
                    break;
                }
                if (x % 8 == 0) {
                    break;
                }
                chessBoard[x] = 1;
                x += 9;

            } //sol alt
            x = Q + 7;
            //sol alt
            while ( x < 64 && chessBoard[x] >= 0) {
                if ((x) % 8 == 7) {
                    break;
                }
                if (x % 8 == 0) {
                    chessBoard[x] = 1;
                    break;
                }
                chessBoard[x] = 1;
                x += 7;
                            }
            Q = 0;
        }
        return chessBoard;
    }

    public static void printChessBoard(int[] chessBoard) {
        System.out.println(Arrays.toString(chessBoard));
        for (int j = 1; j <= chessBoard.length; j++) {
            System.out.print("|" + chessBoard[j - 1]);
            //   System.out.print("|" + ((chessBoard[j - 1] >= 25) ? "Q" : "_"));
            if (j % 8 == 0) {
                System.out.println("|");
            }
        }


        for (int j = 1; j <= chessBoard.length; j++) {
            //   System.out.print("|" + chessBoard[j - 1]);
            System.out.print("|" + ((chessBoard[j - 1] >= 5) ? "Q" : "_"));
            if (j % 8 == 0) {
                System.out.println("|");
            }
        }
    }
}


