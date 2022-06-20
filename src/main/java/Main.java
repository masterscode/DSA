import data_structures.linear.array.Array;

public class Main {
    public static void main(String[] args) {
        Array ar = new Array(2);
        ar.insert(34);
        ar.insert(12);
        ar.insert(34);
        ar.insert(2);

//        ar.remove(1);
        System.out.println(ar.indexOf(20));
//        System.out.println(ar);


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
