package my_projects;

public class double_producer {
    public static void main(String[] args) {
        int number = 3;
        int row=5;
        int column=5;

        doubleProducer(number,3);
        arrayProcuder(number);
        twoDimensionalArrayProducer(row,column);
    }

    private static void doubleProducer(int number) {
        System.out.print(number+" doubles----->   ");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.1f ", Math.random() * (number * 3));
        }
        System.out.println();
    } private static void doubleProducer(int number, int time) {
        System.out.print(number + " integers----->\n");
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%.1f ",  (Math.random() * number * 3));
            }
            System.out.println();
        }
    }

    private static void arrayProcuder(int number) {
        System.out.println();
        System.out.print("One dimensional array----->   ");
        System.out.print("{");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f, ", (Math.random() * number));
        }
        System.out.print("\b}");
    }

    private static void twoDimensionalArrayProducer(int row, int column) {
        System.out.println();
        System.out.println();
        System.out.printf("Two dimensional array-----%dx%d\n" +
                "||||||||||||||||||||||||||| \n",row,column);
        System.out.print("{");
        for (int i = 0; i < row; i++) {
            System.out.print("{");
            for (int j = 0; j < column; j++) {
                System.out.printf("%7.2f,", (Math.random() * 20));
            }

            if (i == (row - 1)) {
                System.out.println("\b}}");
            } else {
                System.out.println("\b}");
            }

        }

    }

}
