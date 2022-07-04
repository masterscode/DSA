package algorithms.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {

        //static variable are the class property not the object property
    public static void main(String[] args) {
        int[] array = new int[]{90, 200};
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

//usage of selection sort in resolving swaps problem
    public static String permutation(int[] array, int swaps){

        for (int i = 0; i < array.length && swaps > 0 ; i++, swaps--) {
            int maxIdx = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] > array[maxIdx]) maxIdx = j;
            }
            int temp = array[i];
            array[i] = array[maxIdx];
            array[maxIdx] = temp;
        }

       return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(""));
    }

    public static String sortCharacters(String s){
        char[] chars = s.toCharArray();
             

        for (int i = 0; i < chars.length; i++) {
            
                for (int j = 1; j < chars.length; j++) {
                    char current = chars[j];
                    char prev = chars[i];

                    if(current <  prev){
                        int temp = prev;
                        chars[i] = chars[j];
                        chars[j] = (char)temp;
                    }
                }
        }

        
        return String.valueOf(chars);
    }
}
