package leetcode;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Medium {

    public static void main(String[] args) {
//        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        System.out.println(getResult(List.of(1,3,2,2)));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public List<List<Integer>>
    highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        return Collections.emptyList();
    }


    public static int getResult(List<Integer> ground) {
        // Write your code here...
        long mode = 0;
         var map =ground.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).orElse(null);

       mode =   null == map.getValue() ? 0 : map.getValue() ;
        List<Integer> g = new ArrayList<>(ground);

        int result = 0;
        for (int index = 0; index < g.size(); index++) {
            int current = g.get(index);
            if(current < mode){
                g.set(index, ++current);
                result++;
            }else if(current > mode){
                g.set(index, --current);
                result++;
            }
        }

        return result;
    }

}
