package my_projects;

public class Queen_pro {
    public static void main(String[] args) {
        int[] cheesBoard = new int[64];
        boolean[] row = new boolean[8];
        boolean[] column = new boolean[8];

        int Queen = (int) (Math.random() * 64);
        cheesBoard[Queen] = 5;
        row[Queen / 8] = true;
        column[Queen % 8] = true;


        for (int i = 0; i < 8; i++) {
            //eğer queen uygun değilse uygun bir queen bulana kadar ara
            while (row[Queen / 8] || column[Queen % 8] || cheesBoard[Queen] != 0) {
                Queen = (int) (Math.random() * 64);
            }
            cheesBoard[Queen] = 5;
            row[Queen / 8] = true;
            column[Queen % 8] = true;


            if (Queen % 8 != 7) {
                int x = Queen - 7;
                while (x > 0) {
                    cheesBoard[x] = 1;
                    if ((x % 8) == 7) {
                        break;
                    }
                    x -= 7;
                }
            } // sağ üst -7
            if (Queen % 8 != 0) {
                int x = Queen - 9;
                while (x >= 0) {
                    cheesBoard[x] = 1;
                    if ((x % 8) == 0) {
                        break;
                    }
                    x -= 9;
                }
            } // sol üst -9
            if (Queen % 8 != 7) {
                int x = Queen + 9;
                while (x < 64) {
                    cheesBoard[x] = 1;
                    if ((x % 8) == 7) {
                        break;
                    }
                    x += 9;
                }
            } // sağ alt +9
            if (Queen % 8 != 0) {
                int x = Queen + 7;
                while (x < 63) {
                    cheesBoard[x] = 1;
                    if ((x % 8) == 0) {
                        break;
                    }
                    x += 7;
                }
            }  // sol alt +7
            Queen = (int) (Math.random() * 64);

      //  printChessBoard(cheesBoard);
            System.out.println("_________________________________\n");
        for (int j = 0; j < cheesBoard.length; j++) {
            if (cheesBoard[j] == 0) {
                System.out.printf("|   ");
            } else System.out.printf("|%3d", cheesBoard[j]);
            if ((j + 1) % 8 == 0) {
                System.out.println("|");
            }
        }
    }

    }

    public static void printChessBoard(int[] chessBoard) {
        for (int j = 1; j <= chessBoard.length; j++) {
            System.out.print("|" + ((chessBoard[j - 1] >= 5) ? "Q" : "_"));
            if (j % 8 == 0) {
                System.out.println("|");
            }
        }
    }
}
//  |  0|  1|  2|  3|  4|  5|  6|  7|
//  |  8|  9| 10| 11| 12| 13| 14| 15|
//  | 16| 17| 18| 19| 20| 21| 22| 23|
//  | 24| 25| 26| 27| 28| 29| 30| 31|
//  | 32| 33| 34| 35| 36| 37| 38| 39|
//  | 40| 41| 42| 43| 44| 45| 46| 47|
//  | 48| 49| 50| 51| 52| 53| 54| 55|
//  | 56| 57| 58| 59| 60| 61| 62| 63|

/*
sol üst -9
sağ üst -7
sol alt +7
sağ alt +9


 */