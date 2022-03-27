package algorithms.hashing;

public interface HashTable {
    //k => key , v => value
    void put(int k, String v);
    String get(int k);
    void remove(int k);
}
