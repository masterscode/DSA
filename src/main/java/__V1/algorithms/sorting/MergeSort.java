package __V1.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 4, 6, 7, 1};
        new MergeSort().sort(array);
        System.out.println(Arrays.toString(array));

    }

    public void sort(int[] array) {
        if (array.length < 2) return;

        int middle = array.length / 2;

        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[array.length - middle];

        System.arraycopy(array, 0, leftHalf, 0, middle);


        for (int i = middle; i < array.length; i++) {
            rightHalf[i - middle] = array[i];
        }


        sort(leftHalf);
        sort(rightHalf);

        merge(leftHalf, rightHalf, array);

    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}
