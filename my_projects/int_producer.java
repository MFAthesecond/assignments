package my_projects;

public class int_producer {
    public static void main(String[] args) {
        int number = 10;
        int row = 6;
        int column = 6;

        printIntegers(number,10);
        arrayProducer(number);
        twoDimensionalArrayProducer(row, column);
    }

    private static void printIntegers(int number) {
        System.out.print(number + " integers----->");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d ", (int) (Math.random() * number * 3));
        }
    }

    private static void printIntegers(int number, int time) {
        System.out.print(number + " integers----->\n");
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%d ", (int) (Math.random() * number * 3));
            }
            System.out.println();
        }
    }

    private static void twoDimensionalArrayProducer(int row, int column) {
        System.out.println();
        System.out.printf("Two dimensional array-----%dx%d\n" +
                "||||||||||||||||||||||||||| \n", row, column);
        System.out.print("{");
        for (int i = 0; i < row; i++) {
            System.out.print("{");
            for (int j = 0; j < column; j++) {
                System.out.printf("%3d,", (int) (Math.random() * 20));
            }

            if (i == (row - 1)) {
                System.out.println("\b}}");
            } else {
                System.out.println("\b}");
            }

        }

    }

    private static void arrayProducer(int number) {
        System.out.println();
        System.out.println();
        System.out.print("One dimensional array----->");
        System.out.print("{");
        for (int i = 0; i < number; i++) {
            System.out.print((int) (Math.random() * number * 3) + ",");
        }
        System.out.println("\b}");
    }
}


