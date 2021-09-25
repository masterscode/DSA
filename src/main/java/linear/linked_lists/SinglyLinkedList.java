package linear.linked_lists;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public Node createSinglyLinkedList(int value){
        Node node = new Node();

        node.value = value;
        node.next = null;

        this.head = node;
        this.tail = node;
        this.size = 1;

        return head;
    }



    public static void main(String[] args) {
        var linkedList = new SinglyLinkedList();
        var head = linkedList.createSinglyLinkedList(10);
        Node next = head.next;

        System.out.println(next);
    }

}
