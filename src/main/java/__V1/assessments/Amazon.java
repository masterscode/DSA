package __V1.assessments;

import java.util.Collections;
import java.util.List;

public class Amazon {
    
    public static int amazon(int k, List<Integer> weights){
        
        int result = 0;
        for (int i = 0; i < weights.size(); i++) {
            
            for (int j = i; j < weights.size(); j++) {
                int diff = max(weights.subList(i, j+1)) - min(weights.subList(i, j+1));
                
                if(diff <= k)  {
                    result++;
                }
            }
        }
        return result;
    }
    public static int max(List<Integer> a){
        Collections.sort(a);
        int idx = Math.max(a.size() - 1, 0);
        return a.get(idx);
    }
    public static int min(List<Integer> a){
        Collections.sort(a);
        return a.get(0);
    }

}
