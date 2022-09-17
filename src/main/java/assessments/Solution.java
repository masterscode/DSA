package assessments;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("Hello"));
    }

    public static String isDuoDigit(int number) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        number = Math.abs(number);
      return   Arrays.stream(String.valueOf(number).split("")).collect(Collectors.toSet()).size() == 2
              ? "y" :"n";
    }

    public static String longestPalindrome(String s) {
        int m = s.length();
        String sol = "";
        for (int i = 0; i < m; i++) {
            String oddLen = extendPalindrome(s, i, i);
            if (oddLen.length() > sol.length()) {
                sol = oddLen;
            }
            String evenLen = extendPalindrome(s, i, i + 1);
            if (evenLen.length() > sol.length()) {
                sol = evenLen;
            }
        }
        //quick oh

        return sol.length() > 0 ? String.format("True, %s", sol) : "false";
    }

    public static String extendPalindrome(String s, int start1, int start2) {
        int i = start1;
        int j = start2;
        int lenOfPal = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            j++;
            i--;
            lenOfPal++;
        }
        if (lenOfPal == 0) return "";
        return s.substring(i + 1, j);
    }
}
