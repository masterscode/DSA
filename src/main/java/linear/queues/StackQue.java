package linear.queues;


import java.util.Stack;

/**
 * since stacks works oppositely to ques, to implement a queue using a stack
 * we'll use two stacks. the first stack will be used for enqueue ops while the second for dequeue ops
 * @author emmanuel
 * @since 10 oct 2021.
 * @version beta
 */
public class StackQue {
    private Stack<Integer> enq = new Stack<>();
    private Stack<Integer> deq = new Stack<>();

    public void enqeue(int item){
        enq.push(item);
    }

    public int dequeue(){
        if (isEmpty()) throw new IllegalStateException();

        if (deq.isEmpty())  refillDeque();

        return deq.pop();
    }

    public void refillDeque (){
        while(!enq.isEmpty())   deq.push(enq.pop());
    }

    public boolean isEmpty(){
        return  enq.isEmpty() && deq.isEmpty();
    }
    public static void main(String[] args) {
        //test code here
    }
}
