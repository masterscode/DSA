package algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void bSearch() {
        assertEquals(3, BinarySearch.bSearch(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
    }
}