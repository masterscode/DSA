package algorithms.sorting;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    BubbleSort underTest;

    @Test
    void shouldSortCollectionInAscendingOrder(){
        int[] actual = new int[]{9,3,5,0};
        int[] expected = new int[]{0,3,5,9};
        BubbleSort.sort(actual);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    
    @Test
    void shouldSortEmptyCollectionInAscendingOrder(){
        int[] actual = new int[]{};
        int[] expected = new int[]{};
        BubbleSort.sort(actual);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
