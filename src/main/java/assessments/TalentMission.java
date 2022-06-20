package assessments;

import java.util.ArrayList;
import java.util.Arrays;

public class TalentMission {

    public static int talentMissionAlgorithm(int N, int k) {

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
