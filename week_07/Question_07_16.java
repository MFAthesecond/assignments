package week_07;

public class Question_07_16 {
    public static int[] selectionSort(int[] list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        writeRunningTime(System.currentTimeMillis() - startTime, "selectionSort");
        return list;
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return array;
    }


    public static int linearSearch(int[] list, int key) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        writeRunningTime(System.currentTimeMillis() - startTime, "linearSearch");
        return -1;
    }

    public static void writeRunningTime(long time, String methodName) {
        System.out.printf("Execution time of invoking the %s in milliseconds: %d\n", methodName, time);
    }

    public static int binarySearch(int[] list, int key) {
        list = selectionSort(list);
        long startTime = System.currentTimeMillis();
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        writeRunningTime(System.currentTimeMillis() - startTime, "binarySearch");
        return -low - 1; // Now high < low, key not found
    }

    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        fillArray(numbers);
        int key = (int) (Math.random() * Integer.MAX_VALUE);
        linearSearch(numbers, key);
        binarySearch(numbers, key);
    }
}
