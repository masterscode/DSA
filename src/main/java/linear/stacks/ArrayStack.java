package linear.stacks;

import java.util.Arrays;

public class ArrayStack {
    private int[] stack;
    int pointer1 = 0;
    int pointer2 = 0;
    int midIndex = 0;
    public ArrayStack(int s){
        int size = s % 2 ==0 ? s : s + 1;
        stack = new int[size];
        pointer2 = stack.length / 2;
        midIndex = (stack.length /2) - 1;
    }


    public int pop1() {
        return 0;
    }


    public int pop2() {
        return 0;
    }

    public void push1(int val) {
        if (pointer1 < pointer2) stack[pointer1++] = val;
    }


    public void push2() {
        return ;
    }
    @Override
    public String toString(){
        return Arrays.toString(stack);
    }

    public static void main(String[] args) {
        ArrayStack stack =  new ArrayStack(5);
        stack.push1(3);
        stack.push1(34);
        stack.push1(3444);

        System.out.println(stack);
    }
}
