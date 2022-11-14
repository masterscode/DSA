package __V1.algorithms.sorting;

public class Sort {

    static void bubble(int[] array, int current, int next) {
        int temp = array[next];
        array[next] = array[current];
        array[current] = temp;
    }
}
