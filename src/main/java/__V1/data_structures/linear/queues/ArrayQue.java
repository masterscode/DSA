package __V1.data_structures.linear.queues;

import java.util.Arrays;


/**
 * @author emmanuel
 * @since 10 oct 2021
 * @implNote Implementing queue ds using array internally
 */
public class ArrayQue {

    private int[] items;
    private int count, rear, front;

    public static void main(String[] args) {
        //no code
        ArrayQue que = new ArrayQue(5);
        que.enqueue(23);
        que.enqueue(21);
        que.enqueue(99);


    }

    public ArrayQue(int capacity){
        this.items = new int[capacity];
    }

    public void enqueue(int item){
        if (isFull()) throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }


    private boolean isFull(){
        return count == items.length;
    }

    private boolean isEmpty(){
        return items.length <= 0;
    }
    public @Override String toString(){
        return Arrays.toString(items);
    }
}
