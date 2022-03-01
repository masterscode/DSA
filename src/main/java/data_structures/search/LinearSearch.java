package data_structures.search;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinearSearch {
    public static int lSearch(int[] array, int v) {
        int result = -1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == v) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        log.info(String.valueOf(LinearSearch.lSearch(new int[]{1, 2, 3, 4, 3, 3, 3, 5, 6, 3, 7, 8, 9}, 15)));
    }
}
