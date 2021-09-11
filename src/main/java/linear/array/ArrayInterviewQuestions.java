package linear.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find all occurrence of a number in an array
// download and configure code metrics plugin
public class ArrayInterviewQuestions {
    private enum ArithmeticOps {
        MUL, SUM
    }
    public static void main(String[] args) {

        final int[] values = new int[]{2, 1, 3, 3, 2, 3};
        ArrayInterviewQuestions interviewQuestions = new ArrayInterviewQuestions();

        System.out.println("has permutation " + interviewQuestions.hasPermutation(values, new int[]{2, 1, 3, 3, 2, 13}));

        System.out.println("does the array has duplicates? " + interviewQuestions.hasDuplicate(values));

        System.out.println("is the value unique? " + interviewQuestions.isUnique(values, 30));

        System.out.println("max product values: " + Arrays.toString(interviewQuestions.maxProduct(values)));

        System.out.println("the value is at index " + interviewQuestions.hasValue(values, 3));

        interviewQuestions.findMissingNumber(interviewQuestions.getArray());


        var result = interviewQuestions.pairSum(values, 4);

        for (Integer[] val : result) System.out.println(Arrays.toString(val));

    }

    public boolean hasPermutation(int[] ar, int[] arr){
        if (ar.length != arr.length) return false;

        int arSum = arrayOps(ar,ArithmeticOps.SUM);
        int arrSum = arrayOps(arr,ArithmeticOps.SUM);

        int arMul = arrayOps(ar,ArithmeticOps.MUL);
        int arrMul = arrayOps(arr,ArithmeticOps.MUL);

        return arSum == arrSum && arMul == arrMul;
    }

    private int arrayOps(int[] ar, ArithmeticOps type){
        int sum = Arrays.stream(ar).reduce(Integer::sum).getAsInt();
        int mul = Arrays.stream(ar).reduce((a,b)->a*b).getAsInt();
        return type.toString().equals("MUL") ? mul : sum;
    }

    public boolean hasDuplicate(int[] values){
        boolean result = true;

        for (int i = 0; i < values.length; i++){
            for (int j = i + 1; j < values.length; j++){
                if (values[i] == values[j]){
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
    public boolean isUnique(int[] values, int value){
        boolean result = true;

        for (int i = 0; i < values.length; i++){
            if (values[i] == value){
                for (int j = i + 1; j < values.length; j++){
                    if (values[j] == value) {
                        result = false;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public int[] maxProduct(int[] values) {
        final int[] result = new int[2];
        int product = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                int calculatedProduct = values[i] * values[j];
                if (calculatedProduct > product) {
                    product = calculatedProduct;
                    result[0] = values[i];
                    result[1] = values[j];
                }

            }
        }
        return result;
    }

    public int hasValue(int[] values, int val) {

        for (int index = 0; index < values.length; index++) {
            if (values[index] == val) return index;
        }
        return -1;
    }

    public List<Integer[]> pairSum(int[] numbers, int target) {
        final int itemsCount = numbers.length;
        List<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < itemsCount; i++) {

            for (int j = i + 1; j < itemsCount; j++) {

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
