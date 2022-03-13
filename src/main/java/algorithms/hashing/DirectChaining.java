package algorithms.hashing;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList[] hashTable;

    int maxChainSize = 5;

    public DirectChaining(int size){
        hashTable = new LinkedList[size];
    }
}
