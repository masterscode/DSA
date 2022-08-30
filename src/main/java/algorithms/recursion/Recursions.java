package algorithms.recursion;

public class Recursions {

    public static void main(String[] args) {
        int fib = fibonacci(12);
        System.out.println(fib);
    }

    public static int fibonacci(int n){
        if ((n== 0) || (n == 1)) return n;
        return fibonacci(n -1 ) + fibonacci(n-2);
    }

    public String fakeReverse(String str){
        if (str.length() == 0) return "";
        return fakeReverse(str.substring(1)) + str.charAt(0) ;
    }
    public static void printNumberRange(int end){
        if (end < 0) return ;
        printNumberRange(end -1);
        System.out.println(end);
    }

    public static int binarySearch(int[] col, int left, int right, int x){
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (x == col[mid]) return mid;

        if (x < col[mid]) return binarySearch(col, left, mid - 1, x);

        return binarySearch(col, mid - 1, right, x);
    }
}
