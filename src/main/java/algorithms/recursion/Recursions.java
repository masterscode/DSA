package algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursions {

    public static void main(String[] args) {
//        int fib = fibonacci(12);
//        System.out.println(fib);
//        triangle(5,0);
        int[] ar = new int[]{5, 4, 3, 2,  8, 9};
        selectionSortR(ar, ar.length - 1, 0, 0);
        System.out.println(Arrays.toString(ar));
    }

    static void selectionSortR(int[] ar, int row, int col, int maxIndex) {
        if (row == 0) return;
        if (col <= row) {

            if (ar[col] > ar[maxIndex]) maxIndex = col;


            selectionSortR(ar, row, col + 1, maxIndex);
        } else {
            int temp = ar[maxIndex];
            ar[maxIndex] = ar[row - 1];
            ar[row - 1] = ar[row];
            ar[row] = temp;

//            if (ar[row] < ar[maxIndex]) {
//                int temp = ar[row];
//                ar[row] = ar[maxIndex];
//                ar[maxIndex] = temp;
//            }
            selectionSortR(ar, row - 1, 0, 0);
        }
    }

    static void bubbleSortR(int[] ar, int row, int col) {
        if (row == 0) return;
        if (col < row) {

            if (ar[col] > ar[col + 1]) {
                int temp = ar[col];
                ar[col] = ar[col + 1];
                ar[col + 1] = temp;
            }
            bubbleSortR(ar, row, col + 1);
        } else {
            bubbleSortR(ar, row - 1, 0);
        }
    }

    static void triangle(int row, int col) {
        if (row == 0) return;
        if (col < row) {
            System.out.print('*');
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);

        }
    }

    static List<Integer> listSearch(int[] arr, int k, int idx) {
        List<Integer> list = new ArrayList<>();
        if (idx >= arr.length) {
            return new ArrayList<>();
        }
        if (arr[idx] == k) {
            list.add(idx);
        }
        List<Integer> l = listSearch(arr, k, idx + 1);
        list.addAll(l);
        return list;
    }

    static int lSearch(int[] arr, int k, int idx) {
        if (idx >= arr.length) return -1;
        if (arr[idx] == k) return idx;
        return lSearch(arr, k, idx + 1);
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1)) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String fakeReverse(String str) {
        if (str.length() == 0) return "";
        return fakeReverse(str.substring(1)) + str.charAt(0);
    }

    public static void printNumberRange(int end) {
        if (end < 0) return;
        printNumberRange(end - 1);
        System.out.println(end);
    }

    public static int binarySearch(int[] col, int left, int right, int x) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (x == col[mid]) return mid;

        if (x < col[mid]) return binarySearch(col, left, mid - 1, x);

        return binarySearch(col, mid - 1, right, x);
    }
}
