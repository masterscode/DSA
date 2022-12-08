import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream.rangeClosed(1, 100)
        .parallel().filter(n -> (n % 2) == 0)
        .forEach(numbers::add);
        
//        System.out.println(numbers);

        System.out.println(
                negSubstring("emmanuel")
        );

    }

    public static String negSubstring(String str){

        StringBuilder result = new StringBuilder();
        String s = "";
        for (int i = 1; i <= str.length() && str.length() - i >= 0 ; i++) {
            if (result.length() == 10 ) break;
            int index = str.length()  - i;
            result.append(str.charAt(index));
            s = Character.toString(str.charAt(index)).concat(s);

        }
        return  s; //result.toString();
    }

    public static int sumSuccession(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            boolean even = i % 2 == 0;
            int num = even ? nums.get(i) : -1 * nums.get(i);
            sum+= num;
        }
        return sum;
    }
}
