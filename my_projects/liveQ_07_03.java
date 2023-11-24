package my_projects;

import java.util.Scanner;

public class liveQ_07_03 {
    public static void main(String[] args) {
        makeTheTablau();
    }

    public static void makeTheTablau() {
        char[] list1 = new char[17];
        int[] list = new int[8];
        int[] placesCanBeAvaibleForQueen = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        for (int w = 0; w < 8; w++) {
            int m = putTheQueen(list, placesCanBeAvaibleForQueen);
            for (int i = 0; i < list1.length; i++) {
                if (i % 2 == 0) {
                    list1[i] = '|';
                    System.out.print(list1[i]);
                } else {

                    if (i == m) {
                        list1[i] = 'Q';
                        System.out.print(list1[i]);
                    } else {
                        list1[i] = ' ';
                        System.out.print(list1[i]);
                    }}}
            System.out.println();
        }
    }
    public static int putTheQueen(int[] list, int[] placesCanBeAvaibleForQueen) {
        int i = (int) (Math.random() * 8);
        if (list[i] == 0) {
            list[i] = placesCanBeAvaibleForQueen[i];
        } else {
            while (list[i] != 0) {
                i = (int) (Math.random() * 8);
            }
            list[i] = placesCanBeAvaibleForQueen[i];
        }
        return list[i];
    }

}

//2 15 6 5 1 4 54 7 8 5 5 5 4 7 8 9 6 22 55 0