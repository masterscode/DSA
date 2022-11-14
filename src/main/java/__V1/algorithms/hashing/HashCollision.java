package __V1.algorithms.hashing;

import java.util.LinkedList;

public class HashCollision {
    LinkedList[] hashTable;

    int maxChainSize = 5;

    public HashCollision(int size){
        hashTable = new LinkedList[size];
    }


    public int linearProbing(String v, int cells){
        return Hashing.hash(v,cells) + 1;
    }
}
