package linear;

import java.util.Arrays;

public class Array {
    private final int[] a = {1};
    private int[] _array;
    private int index = 0;
    private int length;

    public Array(int length) {
        this.length = length;
        this._array = new int[this.length];
    }

    public void insert(int value) throws ArrayIndexOutOfBoundsException {
        if (index == length) {
            int[] _new = new int[length * 2];
            System.arraycopy(_array, 0, _new, 0, _array.length );
            _array = _new;
        }
        _array[index++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Invalid index");
        for (int i = 0; i < length; i++) {
            _array[i] = _array[i + 1];
        }
        length--;
    }

    public int indexOf(int value) {
        for (int i=0; i < _array.length; i++) {
            if (_array[i] == value) return i;
        }
        return -1;
    }
    public void println() {
        Arrays.stream(_array).forEach(System.out::println);
    }

    public int max() {
        int largest = 0;
        for (int i : _array) {
            if (i > largest) largest = i;
        }
        return largest;
    }

    @Override
    public String toString() {
        return Arrays.toString(_array);
    }
}
