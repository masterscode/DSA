package algorithms.dp.all_possible_substr;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePalindrome {
    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    private void helper(int ind, String s, List path, List<List> res) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(s, ind, i)) {
                path.add(s.substring(ind, i + 1));
                helper(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    public List<List> partition(String s) {
        List<List> res = new ArrayList<>();
        List path = new ArrayList<>();
        helper(0, s, path, res);
        return res;

    }

    public static void main(String[] args) {
        AllPossiblePalindrome possiblePalindrome = new AllPossiblePalindrome();
        var ps= possiblePalindrome.partition("nitin");
        System.out.println(ps);

//        [[n, i, t, i, n], [n, iti, n], [nitin]]
//        n i t i n n iti n nitin
    }
}
