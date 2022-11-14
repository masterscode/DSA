package __V1.assessments;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Symphony {
    public static void main(String[] args) {

        System.out.println(total(new String[]{"apple 4 5", "sandine 2 3"}));
    }

    public static String total(String[] groceryList) {
        //Insert your code here
        int[] priceList = new int[groceryList.length];
        int indx = 0;
        int sum = 0;
        for (String item : groceryList) {
            if(item.isBlank()) continue;

            String[] prices = item.split(" ");
            int price = 0;
            int quantity = 0;
            if (prices[1].contains(";")){
                prices = prices[1].split(";");
                price = Integer.parseInt(prices[0]);
                quantity = Integer.parseInt(prices[1]);
            }else {
                price = Integer.parseInt(prices[1]);
                quantity = Integer.parseInt(prices[2]);
            }
            priceList[indx++] = price * quantity;
                sum+= price * quantity;
        }

        String priceString ="";
        for (int i = 0; i < priceList.length; i++) {
            if(i < (priceList.length - 1)) priceString = priceString.concat(String.valueOf(priceList[i])).concat("+");
            else priceString = priceString.concat(String.valueOf(priceList[i]));
        }

        return priceString.concat(String.format("=%d", sum));
    }


    private static boolean lucky33(int a, int b){
        if(a == 33 || b == 33) return true;

        if(b - a == 33) return true;

        return Math.max(a,b) - Math.min(a,b) == 33;
    }
}
