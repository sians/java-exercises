package colourful_algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Application {
    public static void main(String [] strs) {
        System.out.println(colourful(263));
        // true
        System.out.println(colourful(236));
        // false
    }

    public static boolean colourful(int num) {
        LinkedList<Integer> digits = new LinkedList<>();
        // split the input number into individual digits
        while(num > 0) {
            digits.push( num % 10);
            num = num / 10;
        }

        LinkedList<Integer> products = new LinkedList<>();
        products.add(digits.get(0));
        int lastDigit = digits.get(0);
        for(int i = 1; i < digits.size(); i++){
            products.add(digits.get(i) * lastDigit);
            lastDigit = digits.get(i);
            products.add(digits.get(i));
        }

        // total product of number
        int total = 1;
        for (int digit : digits) {
            total *= digit;
        }
        products.add(total);

        // create set to filter duplicates
        Set<Integer> resultProducts = new HashSet<Integer>(products);

        if (products.size() == resultProducts.size()) return true; else return false;
    }
}
