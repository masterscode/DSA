package linear.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInterviewQuestions {
    public static void main(String[] args) {


        ArrayInterviewQuestions interviewQuestions = new ArrayInterviewQuestions();

        interviewQuestions.findMissingNumber(interviewQuestions.getArray());


        var result = interviewQuestions.pairSum(new int[]{2, 1, 3, 3, 2,3}, 4);

        for (Integer[] val : result) System.out.println(Arrays.toString(val));

    }
    public List<Integer[]> pairSum(int[] numbers, int target){
        final int itemsCount = numbers.length;
        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < itemsCount; i++){

            for (int j = i + 1; j < itemsCount; j++){

                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    Integer[] found = new Integer[]{numbers[i], numbers[j]};
                    result.add(found);
                }

            }
        }

        return result;
    }
    public void findMissingNumber(int[] numbers) {
        int calculatedSum = 0;
        int expectedSum = 0;

        for (int number : numbers) {
            calculatedSum += number;
        }
        //==| formulae -> n(n+1)/2

        /*
         * == |  to complete the items count n +1
         */
        final int n = numbers.length + 1;
        expectedSum = (n * (n + 1)) / 2;

        final int difference = expectedSum - calculatedSum;

        System.out.println(String.format("the missing number is %d", difference));
    }

    public int[] getArray() {
        return new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
                33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
                43, 44, 45, 46, 47, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 58, 59, 60, 61, 62,
                63, 64, 65, 66, 67, 68, 69, 70, 71, 72,
                74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
                84, 85, 86, 87, 88, 89, 90, 91, 92, 93,
                94, 95, 96, 97, 98, 99, 100
        };
    }
}
