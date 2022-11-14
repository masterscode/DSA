package __V1.data_structures.linear.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stacks {
    private final List<Character> openingPair = Arrays.asList('(', '[','{', '<');
    private final List<Character> closingPair = Arrays.asList(')', ']','}', '>');
    public String reverseString (String str){
        Stack<Character> placeholder = new Stack<>();
        StringBuffer result = new StringBuffer();

        //split the str into char array
        for (char ch : str.toCharArray())
            placeholder.push(ch);

        while(!placeholder.isEmpty())
            result.append(placeholder.pop());

        return result.toString();
    }

    public boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if (openingPair.contains(ch)){
                stack.push(ch);
            }
            if (closingPair.contains(ch)){
                var top = stack.pop();
                if (!isBalanced(top, ch))   return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isBalanced(char left, char right){
        return openingPair.indexOf(left) == closingPair.indexOf(right);
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        System.out.println(stack.isBalanced("emm(a[nue)l"));
    }
}
