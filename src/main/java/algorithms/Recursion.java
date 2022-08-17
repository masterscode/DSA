package algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Recursion {
    public static void main(String[] args) {

        log.info(
            reverse("null")
        );
    }

    public static void practiceFour(int n) {
        int i = 0;

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
