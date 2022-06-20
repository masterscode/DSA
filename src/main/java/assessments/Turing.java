package assessments;

import java.util.List;

public class Turing {

    public static int maxSumTuringTest(List<Integer> A, int k) {
        int result = -1;
        for (int i = 0; i < A.size(); i++) {

            for (int j = 0; j < A.size(); j++) {
                int current = A.get(i);
                int next = A.get(j);
                int sum = Integer.sum(current, next);
                if (sum < k && sum >= result) {
                    result = sum;
                }
            }
        }
        return result;
    }

}
