package linear.linked_lists;

public class LinkedLs {

    private Node first; // alias for linked-list head
    private Node last; // alias for linked-list tails


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

    private boolean isEmpty(){return first == null;}
    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }
}
