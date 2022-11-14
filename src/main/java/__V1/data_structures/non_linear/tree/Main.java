package __V1.data_structures.non_linear.tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(32);
        tree.insert(23);
        tree.insert(12);
        tree.insert(13);
       
        System.out.println(tree);
    }
}
