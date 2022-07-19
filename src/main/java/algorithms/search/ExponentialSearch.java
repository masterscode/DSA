package algorithms.search;

import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{23,5,3,6,3,2,6,7,7,3,2}, 2));
    }

    public static boolean search(int[] array, int x){
        Arrays.sort(array);

        int endPointer = 1;

        for (int i = 0; i < array.length; i++) {
            if(array[endPointer] < x){
                endPointer *= 2;
                continue;
            }

            for (int j = 0; j < endPointer; j++) {
                if (array[j] == x) return true;
            }
        }

        return false;
    }
}
