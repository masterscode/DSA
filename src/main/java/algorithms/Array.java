package algorithms;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Array {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    public Array(){
        log.setLevel(Level.FINE);
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.printArray();
    }

    public void printArray(){
        int[][] ar = getTestArray();
        log.fine(Arrays.deepToString(ar));
    }

    public void loop2DArray(){
        int[][] int2DArray = getTestArray();

        for (int i = 0; i < int2DArray.length; i++) {
            for (int j = 0; j < int2DArray[i].length; j++)
                log.fine(
                        String.valueOf(int2DArray[i][j])
                );
        }
    }

    private int[][] getTestArray(){
        int[][] int2DArray = new int[2][2];
        int2DArray[0][0] = 23;
        int2DArray[0][1] = 3;
        int2DArray[1][0] = 243;
        int2DArray[1][1] = 203;
        return int2DArray;
    }
}
