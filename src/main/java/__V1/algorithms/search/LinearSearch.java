package __V1.algorithms.search;

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

    public static int halfSearch(int[] array, int v) {
        int result = -1;
        int halfLength = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

        for (int index = 0; index < halfLength; index++) {
            if (array[index] == v) {
                result = index;
            }
            int rearIndex = array.length - 1 - index;
            if (array[rearIndex] == v) {
                result = rearIndex;
            }

            if (result >= 0) break;
        }
        return result;
    }

    public static String lastXChars(String v, int x) {
        return v.length() <= x ? v : v.substring(v.length() - x);
    }
}
