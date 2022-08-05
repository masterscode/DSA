import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream.rangeClosed(1, 100)
        .parallel().filter(n -> (n % 2) == 0)
        .forEach(numbers::add);
        
        System.out.println(numbers);


    }

    public static String negSubstring(String str){

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() ; i++) {
            if (result.length() == 10 ) break;
            int index = str.length() - 1 - i;
            result.append(str.charAt(index));

        }
        return   result.reverse().toString();
    }
}
