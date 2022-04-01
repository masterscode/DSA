package data_structures.non_linear.tree;

import lombok.ToString;

@ToString
public class Tree {
    private Node root;


    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.getValue()) {
                if (current.getLeftChild() == null) {
                    current.setLeftChild(newNode);
                }
                current = current.getLeftChild();
                break;
            } else {
                if (current.getRightChild() == null) {
                    current.setRightChild(newNode);
                    break;
                }
                current = current.getRightChild();

            }
        }
    }
}