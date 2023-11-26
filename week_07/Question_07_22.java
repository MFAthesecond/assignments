package week_07;

public class Question_07_22 {
    public static void main(String[] args) {
        int[] chessBoard = new int[64];
        while (true) {
            chessBoard = QueenProblem();
            if (chessBoard[0] == -1) {
                continue;
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

        int Q = (int) (Math.random() * 64);

        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                while (chessBoard[Q] >= 1 || rows[Q / 8] > 0 || columns[(Q % 8)] > 0) {
                    Q = (int) (Math.random() * 64);
                }
            } else {
                Q = 0;
                while (chessBoard[Q] >= 1 || rows[Q / 8] > 0 || columns[(Q % 8)] > 0) {
                    Q++;
                    if (Q > 63) {
                        chessBoard[0] = -1;
                        return chessBoard;
                    }
                }
            }
            rows[Q / 8] = 1;
            columns[(Q % 8)] = 1;
            chessBoard[Q] = 5;
            int x = Q - 7;
            //sağ üst
            while (x > 0 &&  chessBoard[x] >= 0) {
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
            while (x >= 0 &&  chessBoard[x] >= 0) {
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
            while (x < 64 && chessBoard[x] >= 0) {
                if ((x) % 8 == 7) {
                    chessBoard[x] = 1;
                    break;
                }
                if (x % 8 == 0) {
                    break;
                }
                chessBoard[x] = 1;
                x += 9;
            }
            //sol alt
            x = Q + 7;
            while (x < 64 && chessBoard[x] >= 0) {
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
        }
        return chessBoard;
    }

    public static void printChessBoard(int[] chessBoard) {
        for (int j = 1; j <= chessBoard.length; j++) {
            //   System.out.printf("|%3d" ,j-1);
            System.out.print("|" + ((chessBoard[j - 1] >= 5) ? "Q" : "_"));
            if (j % 8 == 0) {
                System.out.println("|");
            }
        }
    }
}