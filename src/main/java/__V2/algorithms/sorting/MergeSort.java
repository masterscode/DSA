package __V2.algorithms.sorting;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

@Slf4j
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 12, 4, 45, 2, 0, 5};
        sort(array);

        log.info(Arrays.toString(array));
//09035488040

    }

    static void sort(int[] array) {
        if (array.length <= 1) return;

        int div = array.length / 2;
        int[] left = new int[div];
        int[] right = new int[array.length - div];

        for (int i = 0; i < div; i++) left[i] = array[i];

        for (int i = 0, j = div; j < array.length; i++, j++) {
            right[i] = array[j];
        }

        log.info("--> input array " + Arrays.toString(array));
        log.info("--> left " + Arrays.toString(left));
        log.info("--> right " + Arrays.toString(right));
        sort(left);
        sort(right);

        merge(left, right, array);


    }

    static void swap() {

    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftPointer = 0, rightPointer = 0, pointer = 0;
        int end = Math.min(left.length, right.length);
//        while (leftPointer < left.length && rightPointer < right.length) {
//            if (left[leftPointer] < right[rightPointer]) {
//                array[pointer++] = left[leftPointer++];
//            } else {
//                array[pointer++] = right[rightPointer++];
//            }
//        }
        for (int i = 0; i < end; i++) {
            if (left[leftPointer] < right[rightPointer]) {
                array[i] = left[leftPointer++];
            } else {
                array[i] = right[rightPointer++];
            }
        }

        for (int i = leftPointer; i < left.length; i++) {
            array[end++] = left[i];
        }

        for (int i = rightPointer; i < right.length; i++) {
            array[end++] = right[i];
        }
//        for (int i = leftPointer; i < left.length; i++) {
//            array[pointer++] = left[i];
//        }
//
//        for (int i = rightPointer; i < right.length; i++) {
//            array[pointer++] = right[i];
//        }

        log.info("--> merged array " + Arrays.toString(array));

    }


    static void callable() {
        List<Callable> callables = new ArrayList<>();

        List<Object> res = callables.stream().map(callable ->
                {
                    try {
                        return ForkJoinPool.commonPool().submit(callable).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
        ).toList();

        log.info("{}", res);
    }
}
