package __V1.algorithms.sorting;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountingSort {
    
    public static void sort(int[] array){
        //first find max num in array
        int max = 0;
        for (int item : array) if(item >= max)  max = item;
        int[] counting = new int[++max];
        

        for (int count : array) counting[count]++;
        

        int k = 0;
        for (int i = 0; i < counting.length; i++) {
            for (int j = 0; j < counting[i]; j++) {
                array[k++] = i;
            }
        }

    }


    public static void main(String[] args) {
        int[] array = new int[]{3,3,6,4,4,6,4};
        sort(array);
        log.info(Arrays.toString(array));

    }
}
