package __V1.algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class StringAlgos {
    public static void main(String[] args) {
    }

    public static int countVowels(String s) {
        Set<String> vowels = Set.of("a", "e", "i", "o", "u");
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.contains(Character.toString(ch))) count += 1;
        }

        return count;
    }

    public static String reverse(String s) {
        int marker = s.length();
        StringBuilder result = new StringBuilder(s);
        while (marker-- > 0) {
            result.append(s.charAt(marker));
        }
        return result.toString();
    }

    public static String reverseWords(String word) {
        String[] words = word.split(" ");
        StringBuilder result = new StringBuilder();
        int marker = words.length;
        while (marker-- > 0) {
            result.append(words[marker].concat(" "));
        }
        return result.toString().trim();
    }

    public static boolean isRotation(String str1, String str2) {
        return (str1.length() == str2.length() && str1.concat(str2).contains(str2));
    }

    public static String removeDuplicate(String s) {
        StringBuilder result = new StringBuilder();
        Set<String> lookup = new HashSet<>();
        int marker = -1;
        while (marker++ < s.length() - 1) {
            var current = Character.toString(s.charAt(marker));
            if (!lookup.contains(current)) {
                lookup.add(current);
                result.append(current);
            }
        }
        return result.toString().trim();
    }

    public static char maxOccurenceCharacter(String s) {
        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        char result = ' ';
        for (var ch : s.toCharArray()) {
            frequencies[ch]++;
        }

        int MAX = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > MAX) {
                MAX = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static String capitalize(String s) {
        String[] words = s.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = word.substring(0, 1).toUpperCase(Locale.ROOT).concat(word.substring(1).toLowerCase(Locale.ROOT));
        }

        return String.join(" ", words);
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] first = (str1.toCharArray());
        Arrays.sort(first);
        char[] second = str2.toCharArray();
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static boolean palindrome(String s) {
        int rearIndex = s.length() - 1;
        int frontIndex = 0;

        while (frontIndex++ < rearIndex--) {
            if (s.charAt(frontIndex) != s.charAt(rearIndex)) return false;
        }

        return true;
    }

}
