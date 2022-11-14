package __V1.assessments;

import java.util.List;

public class Andela {
    public static void main(String[] args) {

    }
    public static  String palindromeChecker(String s, List<Integer>startIndex, List<Integer>endIndex,List<Integer>subs){

        String result = "";

        for (int i = 0; i < startIndex.size(); i++) {
            int start = startIndex.get(i);
            int end = endIndex.get(i);
            int sub = subs.get(i);
            String str = s.substring(start, end);

            int subCount = 0;

            if(sub == 0){
                if(isPalindrome(str)) result = result.concat("1");
                else result = result.concat("0");
                continue;
            }
            if(isPalindrome(str)){
                result = result.concat("1");
                continue;
            }


            for (int j = 0; j < (subCount/2); j++) {
//                if(s.charAt(i) == s.charAt(n - i - 1)) continue;
//
//                if(str.charAt(i) < str.charAt(n - i - 1)) s = s.replace(s.charAt(n - i - 1),s.charAt(i));
//
//                else s = s.replace(s.charAt(n-1),s.charAt(n - i - 1));

                if(isPalindrome(str)){
                    result = result.concat("1");
                    break;
                }

            }

        }

        return result;
    }


    static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
