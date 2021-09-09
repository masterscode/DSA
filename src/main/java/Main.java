import linear.array.Array;

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
}
