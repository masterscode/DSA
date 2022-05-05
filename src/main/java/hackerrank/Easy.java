package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Easy {
    public static void main(String[] args) {

        System.out.println(
                Easy.solution(285, 20)
        );
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int counter = 0;
        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            int limit = i + m - 1;
            for (int j = i; j <= limit; j++) {
                if (limit >= s.size()) break;
                sum += s.get(j);
            }
            if (sum == d) counter++;
        }

        return counter;
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        arr = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (var bird : arr) {
            int birdCount = map.getOrDefault(bird, 0) + 1;
            map.put(bird, birdCount);
        }

        int max = 0;
        int key = Integer.MAX_VALUE;

        for (var set : map.entrySet()) {
            if (set.getValue() >= max && set.getKey() < key) {
                max = set.getValue();
                key = set.getKey();
            }
        }
        return key;
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        String message = "Bon Appetit";

        int omission = bill.get(k);
        int totalCost = bill.stream().reduce(Integer::sum).get() - omission;
        int charged = b - ((totalCost) / 2);

        System.out.println(
                charged == 0 ? message : charged
        );
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> sockPair = new HashMap<>();

        for (int color : ar) {
            int colorCount = sockPair.getOrDefault(color, 0) + 1;
            sockPair.put(color, colorCount);
        }

        int result = 0;

        for (var set : sockPair.entrySet()) {
            if (set.getValue() < 2) continue;
            result += set.getValue() / 2;
        }

        return result;

    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int frontCount = 0;
        int rearCount = 0;

        int counter = 0;
        while (counter <= n) {
            if (isBetween(p, counter)) break;
            frontCount += 1;
            counter += 2;
        }

        counter = n;

        while (counter >= 0) {
            if (isBetween(p, counter)) break;
            rearCount += 1;
            counter -= 2;
        }


        return Math.min(frontCount, rearCount);
    }

    public static int pageCountX(int n, int p) {
        // Write your code here
        if (n == 2) return 0;
        if (n % 2 == 0 && n - p == 1) return 1;

        return Math.min(p / 2, (n - p) / 2);
    }

    private static boolean isBetween(int page, int sheet) {
        return
                page == (sheet - 1) || page == sheet;
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int result = 0;
        char valley = 'D';

        for (int counter = 0; counter < path.length(); counter++) {

            int valleyCount = 0;

            if (path.charAt(counter) == valley) {
                for (int index = counter; index < path.length(); index++) {

                    if (path.charAt(index) != valley && valleyCount > 1) {
                        counter = index;
                        break;
                    }
                    valleyCount += 1;
                }
            }
            if (valleyCount > 1) result++;
        }
        return result;
    }

    public static int countingValleysX(int steps, String path) {

        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for (char c : path.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++v;

        }

        return v;
    }

    public static int solution(int N, int k) {

        var nums = new ArrayList<>(Arrays.stream(String.valueOf(N).split("")).map(Integer::parseInt).toList());
        StringBuilder sb = new StringBuilder();
        for (int in = 0; in < nums.size(); in++) {
            if (k <= 0) break;
            var current = nums.get(in);

            int diff = 9 - current;
            if (diff > k) {
                diff = k;
                k = 0;
            } else {
                k = k - diff;
            }
            nums.set(in, Integer.sum(current, diff));

        }
        nums.forEach(sb::append);
        return Integer.parseInt(sb.toString());
    }


}
