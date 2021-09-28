package linear.linked_lists;

public class LinkedLs {

    private Node first; // alias for linked-list head
    private Node last; // alias for linked-list tails


    public void addLast(int value){
        var node = new Node(value);


        // 1. check to see if the linked-list is empty

        if (first == null)  first = last = node;
        else{
            last.next = node;
            last = node;
        }


    }

    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }
}
