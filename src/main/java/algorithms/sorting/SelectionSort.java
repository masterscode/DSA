package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] array = new int[]{90, 200};
//        new SelectionSort().sort(array);
        s_sort(array);
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

    public static void s_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }

            var temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
