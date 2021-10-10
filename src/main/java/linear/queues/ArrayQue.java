package linear.queues;

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

        System.out.println(que);

    }

    public ArrayQue(int capacity){
        this.items = new int[capacity];
    }

    public void enqueue(int item){
        if (count == items.length) throw new IllegalStateException();
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

    public @Override String toString(){
        return Arrays.toString(items);
    }
}
