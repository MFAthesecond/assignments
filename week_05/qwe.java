package week_05;

import java.util.Scanner;

public class qwe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Karonun büyüklüğünü giriniz: ");
        int k = input.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 1; j < k - i; j++) {
                System.out.printf("%-3s", " ");
            }
            System.out.printf("%s", "*");
            for (int j = 0; j < i; j++) {
                System.out.printf("%-6s", "");
            }
            if (i != 0) {
                System.out.printf("%-3s", "\b*");
            }
            System.out.println();
        }
        for (int i = 1; i < k; i++) {
            for (int j = k - i; j < k; j++) {
                System.out.printf("%-3s", "");
            }
            System.out.printf("%s", "*");
            for (int j = 1; j < k - i; j++) {
                System.out.printf("%-6s", " ");
            }
            System.out.printf("%-3s", "\b*");
            System.out.println();
        }
    }
}

