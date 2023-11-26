package week_09.Question_09_06;

import java.util.Arrays;

public class Question_09_06 {
    public static void main(String[] args) {
        int[] array = fillArray();
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort: "+stopWatch.getElapsedTime());
        stopWatch.getElapsedTime();
    }

    private static int[] fillArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
}
