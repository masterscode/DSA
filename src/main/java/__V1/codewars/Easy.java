package __V1.codewars;

import java.util.ArrayList;

public class Easy {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int ins = 0, outs = 0;
        for(int[] ar : stops){
            ins+= ar[0];
            outs+= ar[1];
        }

        return ins - outs;
    }

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }


        return result;
    }
}
