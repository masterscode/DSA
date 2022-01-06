package data_structures.linear.queues;

import java.util.Queue;
import java.util.Stack;


/**
 * @author emmanuel
 */
public class Que {

    public static void main(String[] args) {
        //empty
    }

    public static void reverseQue (Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())    stack.push(queue.remove());

        while(!stack.isEmpty()) queue.add(stack.pop());

        System.out.println(queue);
    }
}
