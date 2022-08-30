package data_structures.non_linear.tree;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
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
                    break;
                }
                current = current.getLeftChild();
            } else {
                if (current.getRightChild() == null) {
                    current.setRightChild(newNode);
                    break;
                }
                current = current.getRightChild();

            }
        }
    }

    public Integer recurseList(List<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.get(0) + recurseList(list.subList(1, list.size()));
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    public int height() {
        return height(root);
    }

    public int min() {
        return min(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.println(root.getValue());
        traversePreOrder(root.getLeftChild());
        traversePreOrder(root.getRightChild());
    }

    private void traverseInOrder(Node root) {
        if (root == null) return;
        traversePreOrder(root.getLeftChild());
        System.out.println(root.getValue());
        traversePreOrder(root.getRightChild());
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;
        traversePreOrder(root.getLeftChild());
        traversePreOrder(root.getRightChild());
        System.out.println(root.getValue());
    }

    private int height(Node root) {
        if (root == null) return -1;

        if (isLeafNode(root)) return 0;

        return 1 + Math.max(
                height(root.getLeftChild()),
                height(root.getRightChild())
        );
    }

    private int min(Node root) {
        if (isLeafNode(root)) return root.getValue();

        int leftLeaf = min(root.getLeftChild());
        int rightLeaf = min(root.getRightChild());

        int leftRightMin = Math.min(leftLeaf, rightLeaf);

        return Math.min(leftRightMin, root.getValue());
    }

    private boolean isLeafNode(Node node) {
        return node.getRightChild() == null && node.getLeftChild() == null;
    }

}