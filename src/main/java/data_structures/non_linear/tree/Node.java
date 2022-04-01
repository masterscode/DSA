package data_structures.non_linear.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int v){
        value = v;
    }
}
