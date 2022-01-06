package data_structures.linear.linked_lists;

import java.util.NoSuchElementException;

public class LinkedLs {

    private int size;
    private Node first; // alias for linked-list head
    private Node last; // alias for linked-list tails

    public void reverse(){
        var previous = first;
        var current = previous.next;
        var next = current.next;
        while(current != null){
            current.next = previous;
            previous = current;
            current = next;
        }
    }

    public void addLast(int value){
        var node = new Node(value);
        // 1. check to see if the linked-list is empty
        if (isEmpty())  first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value){
        Node  node  = new Node(value);
        if (isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    private int indexOf(int item){
        int index = 0;
        var current  = first;
        while(current.next != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return  -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    private boolean isEmpty(){return first == null;}

    public void removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();

        //if there is only one element on the list
        if (first ==  last) {
            first = last = null;
            return;
        }

        final Node second = first.next;
        first.next = null;
        first = second;
    }

    public int getKthNodeValue(int k){
        var kthNode = first;
        var endNode = first;

        //set current and end kth length apart
        for (int i = 0; i <= k;i++){
            endNode = endNode.next;
        }

        //set kthNode
        while(endNode != null){
            kthNode = kthNode.next;
            endNode = endNode.next;
        }

        return kthNode.value;
    }

    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();
        last = getPrevious(last);
        last.next = null;
    }

    public int[] toArray(){
        final int[] array = new int[size];
        var current  = first;
        int index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private void setSize(OP type){
        if (OP.DECREMENT == type)   size--;
        else    size++;
    }
    public Integer size(){
        return size;
    }
    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return  current;
            current = current.next;
        }
        return null;
    }

    private class Node{
        private final int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }

    private  enum OP{INCREMENT, DECREMENT}

    public static void main(String[] args) {

        LinkedLs linkedList = new LinkedLs();

        linkedList.addFirst(40);
        linkedList.addFirst(4);
        linkedList.addFirst(40000);

        int a = 4, b = 9;

        a = b + a - b;
        b = b - a + a;

        System.out.println(b);
    }
}
