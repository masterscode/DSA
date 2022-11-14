package __V1.data_structures.linear.linked_lists;

import java.util.NoSuchElementException;

public class LinkedLs {

    private int size;
    private Node<Integer> head; // alias for linked-list head
    private Node<Integer> tail; // alias for linked-list tails

    public void reverse() {
        var previous = head;
        var current = previous.next;
        var next = current.next;
        while (current != null) {
            current.next = previous;
            previous = current;
            current = next;
        }
    }

    public void addLast(int value) {
        Node node = new Node<Integer>(value);
        // 1. check to see if the linked-list is empty
        if (isEmpty()) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(int value) {
        Node<Integer> node = new Node<>(value);
        if (isEmpty()) head = tail = node;
        else {
            node.next = head;
            head = node;
        }
    }

    private int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current.next != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        //if there is only one element on the list
        if (head == tail) {
            head = tail = null;
            return;
        }

        final Node second = head.next;
        head.next = null;
        head = second;
    }

    public int getKthNodeValue(int k) {
        var kthNode = head;
        var endNode = head;

        //set current and end kth length apart
        for (int i = 0; i <= k; i++) {
            endNode = endNode.next;
        }

        //set kthNode
        while (endNode != null) {
            kthNode = kthNode.next;
            endNode = endNode.next;
        }

        return kthNode.value;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        tail = getPrevious(tail);
        tail.next = null;
    }

    public int[] toValueArray() {
        final int[] array = new int[size];
        var current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public Node[] toArray() {
        final Node[] array = new Node[size];
        var current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current;
            current = current.next;
        }
        return array;
    }

    private void setSize(OP type) {
        if (OP.DECREMENT == type) size--;
        else size++;
    }

    public Integer size() {
        return size;
    }

    private Node getPrevious(Node<Integer> node) {
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    private enum OP {INCREMENT, DECREMENT}

    public LinkedLs partitionBy(int x) {

        Node currentNode = head;


        return this;
    }

    public LinkedLs partitionBy(LinkedLs l, int x) {

        Node<Integer> currentNode = l.head;
        l.tail = l.head;

        while (currentNode != null) {
            Node<Integer> next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = l.head;
                l.head = currentNode;
            } else {
                l.tail.next = currentNode;
                l.tail = currentNode;
            }

            currentNode = next;
        }
        l.tail.next = null;
        return l;

    }
}
