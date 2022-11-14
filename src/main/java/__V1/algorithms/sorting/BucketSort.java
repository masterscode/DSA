package __V1.algorithms.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class BucketSort {

    public static void sort(int[] array, int z) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < z; i++) buckets.add(new ArrayList<>());

        for (int item : array) buckets.get(item / z).add(item);

        int idx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int item : bucket) {
                array[idx++] = item;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{4,3,6,4,2,6,0};

        sort(array, 4);

        log.info(Arrays.toString(array));
    }
}
