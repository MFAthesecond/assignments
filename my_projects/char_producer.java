package my_projects;

public class char_producer {
    public static void main(String[] args) {
        int number = 10;
        int row = 8;
        int column = 10;

        printIntegers(number);
        arrayProducer(number);
        twoDimensionalArrayProducer(row, column);
    }

    private static void printIntegers(int number) {
        System.out.print(number + " chars----->  ");
        for (int i = 0; i < number; i++) {
            System.out.printf("'%c' ", 'A' + ((int) (Math.random() * 5)));
        }
        System.out.println();
    }

    private static void twoDimensionalArrayProducer(int row, int column) {
        System.out.println();
        System.out.printf("Two dimensional array-----%dx%d\n" +
                "||||||||||||||||||||||||||| \n", row, column);
        System.out.print("{");
        for (int i = 0; i < row; i++) {
            System.out.print("{");
            for (int j = 0; j < column; j++) {
                System.out.printf("'%c', ", ('A' + ((int) (Math.random() * 5))));
            }

            if (i == (row - 1)) {
                System.out.println("\b\b}}");
            } else {
                System.out.println("\b\b},");
            }

        }

    }

    private static void arrayProducer(int number) {
        System.out.println();
        System.out.println();
        System.out.print("One dimensional array----->  ");
        System.out.print("{");
        for (int i = 0; i < number; i++) {
            System.out.printf("'%c', ", ('A' + ((int) (Math.random() * 5))));

        }
        System.out.println("\b}");
    }
}


