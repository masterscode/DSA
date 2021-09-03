package algorithms;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] int2DArray = new int[2][2];

        int2DArray[0][0] = 23;
        int2DArray[0][1] = 3;
        int2DArray[1][0] = 243;
        int2DArray[1][1] = 2003;

        System.out.println(
                Arrays.deepToString(int2DArray)
        );


    }
}
