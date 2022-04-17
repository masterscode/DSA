package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 4, 6, 7, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        boolean sorted;
        for (int i = 0; i < array.length; i++) {
            sorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    Sort.bubble(array, j, j - 1);
                    sorted = false;
                }
            }
            if (sorted) return;
        }
    }


}
