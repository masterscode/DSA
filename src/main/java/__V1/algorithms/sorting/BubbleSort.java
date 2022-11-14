package __V1.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 4, 6, 7, 1};
        bubble_sort(array);
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

    public static void bubble_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean sorted = true;
            for (int j = 1; j < (array.length - i ); j++) {
                int cur = j;
                int prev = j -1;
                if (array[cur] < array[prev]) {
                    int temp = array[cur];
                    array[cur] = array[prev];
                    array[prev] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
    }

}
