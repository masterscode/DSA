package algorithms.hashing;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Hashing {
    public static void main(String[] args) {
//        System.out.println(Hashing.mod("emmanuel", 24));

        System.out.println(firstNonRepeatedChars("jjcc"));
    }

    public static int mod(int v, int cellSize) {
        return v % cellSize;
    }

    public static int mod(String value, int cellNumber) {
        int total = 0;
        final int vLength = value.length();

        for (int i = 0; i < vLength; i++) {
            total += value.charAt(i);
        }
        return total % cellNumber;
    }


    public static String firstNonRepeatedChars(String str) {
        Map<String, Integer> store = new HashMap<>();
        var strs = str.split("");
        Arrays.stream(strs).forEach(s -> {
            int count = store.getOrDefault(s, 0);
            store.put(s, (count + 1));
        });
       return  Arrays.stream(strs).filter(s->store.get(s) <=1).findFirst().orElse(null);

    }
}