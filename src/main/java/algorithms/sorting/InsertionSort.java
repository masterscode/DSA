package algorithms.sorting;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 4, 6, 7, 1};
        sort(array);
        log.info(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            var current = array[i];

            var j = i - 1;

            while (j >= 0 && array[j] > current){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }


    public static void sortX(int[] array){
        
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && j > current){
                
                j--; 
            }
        }
    }
}
