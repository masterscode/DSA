package algorithms.search;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test()
    @DisplayName(value= "perform linear search on collections for an element")
    void lSearchTest(){
        assertEquals(3, LinearSearch.lSearch(new int[]{1,2,3,4,5,6,7}, 4));
    }

    @Test()
    @DisplayName(value= "perform linear search on collections for an element but with 0(n/2) time")
    void halfSearchTest(){
        int actualResult = LinearSearch.halfSearch(new int[]{1,2,3,4,5,6,7}, 4);
        assertEquals(3, actualResult);
    }

    @Test()
    @DisplayName(value= "perform linear search on collections for an element but with 0(n/2) time")
    void lastXChars(){
        assertAll("last x chars should equal",
                ()-> assertEquals("nuel",  LinearSearch.lastXChars("emmanuel", 4)),
                ()-> assertEquals("7035140205",  LinearSearch.lastXChars("+2347035140205", 10)),
                ()-> assertEquals("7035140205",  LinearSearch.lastXChars("2347035140205", 10)),
                ()-> assertEquals("7035140205",  LinearSearch.lastXChars("07035140205", 10))
        );
    }
}