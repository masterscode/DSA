package algorithms.search;

import java.util.Arrays;



public class JumpSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{23,5,3,6,3,2,6,7,7,3,2}, 2));
    }
    public static boolean search(int[] array, int x){

        Arrays.sort(array);

        int blocks = Double.valueOf(Math.sqrt(array.length)).intValue();
        
        int startPointer = 0;
        int endPointer = blocks; 


        for (int i = 0; i < blocks && startPointer < array.length; i++) {
            int max = array[--endPointer];
            if(x > max){
                startPointer = endPointer;
                endPointer+=blocks;
                continue;
            }
            for (int j = startPointer; j < endPointer; j++) {
                if(x == array[j]) return true;
            }
        }
        return false;
    }
}
