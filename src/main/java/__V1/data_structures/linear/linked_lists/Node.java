package __V1.data_structures.linear.linked_lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Node<T> {
    public T value;
    public Node next;
    public Node prev;

    public Node (T v){
        this.value = v;
    }
}
