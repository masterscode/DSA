package algorithms.recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Recursion {
    static int fp = 15;

    public static void main(String[] args) {
        System.out.println(mapToList(10));
    }

    static String toBinaryStr(int n) {
        if (n <= 0) return "";
        return toBinaryStr(n / 2).concat(String.valueOf(n % 2));
    }

    static List<Integer> mapToList(int max){
        if (max <= 0) {
            var list = new ArrayList<Integer>();
            list.add(max);
            return list;
        }
        List<Integer> list = mapToList(max - 1);
        list.set(0, list.get(0)+max);
        return list;

    }
    static int gfg2(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + gfg2(n / 2);
    }
    static void gfg3(int n) {
        int i = 0;
        if (n > 1)
            gfg3(n - 1);
        for (i = 0; i < n; i++)
            System.out.print(" * ");
    }
    static void gfg4(int x) {
        if(x > 0) {
            gfg4(--x);
            System.out.print(x + " ");
            gfg4(--x);
        }
    }
        static int gfg5(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return gfg5(a * a, b / 2);

        return gfg5(a * a, b / 2) * a;
    }


    static void gfg6(String s) {
        if (s.length() == 0) return;

        gfg6(s.substring(1));
        gfg6(s.substring(1));
        System.out.println(s.charAt(0));
    }

    static int gfg7(int n) {
        int f, t;
        if (n <= 2) {
            fp = 1;
            return 1;
        }

        t = gfg7(n - 1);
        f = t + fp;
        fp = t;
        return f;
    }


    static void printn(int n) {
        if (n == 0) return;

        printn(n - 1);
        System.out.println(n);
    }

    public static void practiceFour(int n) {
        int i;

        if (n > 1)
            practiceFour(n - 1);

        for (i = 0; i < n; i++)
            log.info(" * ");
    }

    public static String reverse(String s) {
        if (s.length() == 1)
            return s;
        return reverse(
                s.substring(1))
                .concat(String.valueOf(s.charAt(0))
                );
    }

    public static String recurse(String string, int i) {

        log.info(Character.toString(string.charAt(i)));
        return i < string.length() - 1 ? recurse(string, i + 1)
                : "";
    }

    public static int recurse(int start) {

        if (start <= 0)
            return start;

        return start + recurse(start - 1);
    }

    public static int practiceOne(int n) {
        if (n == 1)
            return 1;
        log.info("the current value of n ==> " + n);
        return 1 + practiceOne(n / 2);
    }

    public static int practiceTwo(int f) {
        if (f <= 1)
            return 1;
        return f * practiceTwo(f - 1);
    }

    public static int practiceThree(int fib) {

        int sum = 0;
        for (int i = 0; i < fib; i++) {
            sum += Math.max(i, i - 1) + Math.max(i - 2, 0);
        }
        return sum;
    }

    public static int threeX(int fib) {
        if (fib == 0)
            return 0;
        if (fib == 1)
            return 1;

        return threeX(fib - 1) + threeX(fib - 2);
    }

    public static String xxx(String d) {
        StringBuilder str = new StringBuilder(d);

        str.setCharAt(d.lastIndexOf(":"), ' ');
        // Character.
        return str.toString().replace(" ", "");

    }

}
