package algorithms;

import data_structures.linear.linked_lists.Node;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(reverse("emmanuel"));
    }

    public static String reverse(String s){
        if (s.length() ==  0)   return s;
        return reverse(s.substring(1)).concat(String.valueOf(s.charAt(0)));
    }
}
