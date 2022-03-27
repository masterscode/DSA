package algorithms.hashing;

import lombok.Data;

import java.util.LinkedList;

public class HashTableImpl implements HashTable {
    final int TABLE_SIZE = 10;
    LinkedList<Entry>[] hashTable = new LinkedList[TABLE_SIZE];

    public HashTableImpl() {
    }

    @Override
    public void put(int k, String v) {
        final int index = getKeyHash(k);
        if (hashTable[index] == null) hashTable[index] = new LinkedList<>();
        var bucket = hashTable[index];
        for (var entry : bucket) {
            if (entry.key == k) {
                entry.value = v;
                return;
            }
        }
        Entry entry = new Entry(k, v);
        bucket.addLast(entry);

    }

    @Override
    public String get(int k) {
        final int index = getKeyHash(k);
        var bucket = hashTable[index];
        if (bucket == null) return null;
        for (var entry : bucket) {
            if (entry.key == k) {
                return entry.value;
            }
        }
        return null;
    }

    @Override
    public void remove(int k) {

    }

    private int getKeyHash(int k) {
        return Hashing.mod(k, TABLE_SIZE);
    }

    @Data
    private class Entry {
        private int key;
        private String value;

        public Entry(int k, String v) {
            key = k;
            value = v;
        }
    }
}
