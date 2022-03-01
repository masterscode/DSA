package data_structures.search;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
    public static void main(String[] args) {
        log.info(String.valueOf(BinarySearch.bSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5)));
    }

    private static int bSearch(int[] array, int v) {

        int start = 0;
        int end = array.length - 1;
        int middle = (start + end) / 2;

        while (array[middle] != v && start <= end) {
            if (array[middle] < v) {
                end = middle - 1;
            }
            if (array[middle] > v) {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        return array[middle] == v ? middle : -1;
    }
}
