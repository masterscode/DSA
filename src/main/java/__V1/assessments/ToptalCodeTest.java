package __V1.assessments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ToptalCodeTest {

    public static int solution(int[] P, int[] S) {
        // write your code in Java SE 8

        int count = 0;

        List<Integer> seats = Arrays.stream(S).boxed().collect(Collectors.toList());

        int allPersons = Arrays.stream(P).sum();
        seats.sort(Collections.reverseOrder());
        for (var seat : seats) {
            allPersons -= seat;
            count += 1;
            if (allPersons == 0) break;
        }

        return count;
    }


    public int x(int[] P, int[] S) {
        // write your code in Java SE 8

        int count = 0;
        int seatedPersons = 0;
        List<Integer> seats = Arrays.stream(S).boxed().collect(Collectors.toList());

        int allPersons = Arrays.stream(P).sum();
        seats.sort(Collections.reverseOrder());

        for (int seat : seats) {
            seatedPersons += seat;
            count++;
            if (seatedPersons >= allPersons) break;
        }

        return count;
    }


    public static int pollution(int[] A) {
        // write your code in Java SE 8

        double half = (double) Arrays.stream(A).sum() / 2;
        int filters = 0;

        List<Double> p = Arrays.stream(A).boxed().mapToDouble(Double::valueOf).boxed().collect(Collectors.toList());


        for (int i = 1; i < half; i++) {
            double max = p.stream().max(Double::compareTo).get();
            int maxIndex = p.indexOf(max);

            p.set(maxIndex, max/2);

            filters = i;

            if (p.stream().reduce((a,b)->a+b).get() < half) break;
        }

        return filters;
    }

    //    private void toptal() {
//        public String solution (String message,int K){
//            // write your code in Java SE 8
//
//            String[] splittedMessage = message.split(" ");
    //use StringBuilder for var result
//            String result = "";
//
//            for (String word : splittedMessage) {
//                if (result.length() <= K) {
//                    result = result.concat(word + " ");
//                }
//
//                if (result.trim().length() > K) {
//                    result = result.substring(0, result.lastIndexOf(word));
//                    break;
//                }
//
//
//            }
//
//            return result.trim();
//
//
//        }
//    }

}
