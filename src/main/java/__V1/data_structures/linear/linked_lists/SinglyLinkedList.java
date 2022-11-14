package __V1.data_structures.linear.linked_lists;

import java.util.LinkedList;

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

    public void insertInSinglyLinkedList(int value, int location){
        Node node = new Node();
        node.setValue(value);

        if (this.head ==  null){
            createSinglyLinkedList(value);
            return;
        }else if (location == 0){
            node.next = head;
            head = node;
        }else if (location >= size){
            tail.next = node;
            node.next = null;
            tail = node;
        }else{
            Node tempNode = head;

            int index = 0;

            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
        }
        size++;

    }

    public void traverseLinkedList(){
        if (head == null) System.out.println("Linked list does not exist");
        else{
            Node tempNode = head;

            for (int i =0; i<size; i++){
                System.out.println(tempNode);
                if (i != size - 1) System.out.println(" --> ");
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }


    public static void main(String[] args) {
//        SinglyLinkedList linkedList = new SinglyLinkedList();
//        linkedList.createSinglyLinkedList(5);
//        linkedList.insertInSinglyLinkedList(44,3);

        LinkedList linkedList = new LinkedList();

        linkedList.addLast("the first last");
        linkedList.addLast("the second last");
        linkedList.addLast("the third last");


        System.out.println(linkedList);


    }

}
