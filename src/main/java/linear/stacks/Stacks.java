package linear.stacks;

import java.util.Stack;

public class Stacks {

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
            if (ch == '('){
                stack.push(ch);
            }
            if (ch == ')'){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        System.out.println(stack.reverseString("emmanuel"));
    }
}
