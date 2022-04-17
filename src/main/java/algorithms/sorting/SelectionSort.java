package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 4, 6, 7, 1};
        new SelectionSort().sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) minIndex = j;
                Sort.bubble(array, minIndex, i);
            }

        }
    }
}
