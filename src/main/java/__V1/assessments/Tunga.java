package __V1.assessments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tunga {

    public static String wordSplitTunga(String[] word) {
        String main = word[0];
        List<String> others = Arrays.asList(word[1].split(","));


        for (var w : others) {
            var firstPart = main.substring(0, w.length());
            var otherPart = main.substring(w.length());

            if (firstPart.equals(w) && others.contains(otherPart)) {
                return String.format("%s,%s", firstPart, otherPart);
            }

        }

        return "Not Possible";
    }

    public static String isPalindrome(String s){
        List<String> ex = new ArrayList<>();
        int i = 0;
        int j = s.length() - 1;
        if (s.equals(new StringBuilder(s).reverse().toString()))return "palindrome";

        while (i < j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }
            ex.add(Character.toString(s.charAt(i)));
            i++;
        }

        return s.length()  - ex.size() <= 2 ? "not possible": String.join("", ex);
    }

//    const isPalindrome = str => {
//    const outliers = [];
//        let i = 0;
//        let j = str.length - 1;
//
//        // When the input is a palindrome
//        if (str === [...str].reverse().join("")) return "palindrome";
//
//        // When you can remove 1 or 2 letters to get palindrome
//        while (i < j) {
//            if (str[i] === str[j]) {
//                i++;
//                j--;
//                continue;
//            }
//
//            outliers.push(str[i]);
//            i++;
//        }
//
//        if ((str.length - outliers.length) <= 2) return "not possible";
//
//        return outliers.join("");
//    }
}
